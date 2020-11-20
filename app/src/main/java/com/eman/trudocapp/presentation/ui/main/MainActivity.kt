package com.eman.trudocapp.presentation.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eman.trudocapp.R
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.databinding.ActivityMainBinding
import com.eman.trudocapp.presentation.NavigationListener
import com.eman.trudocapp.presentation.ui.detail.DetailsActivity
import com.eman.trudocapp.utils.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), NavigationListener {
    lateinit var binding: ActivityMainBinding
    private var totalBusiness = 0
    private var isLoading: Boolean = false
    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var adapter: MainBusinessAdapter

    //list for holding data
    lateinit var list: ArrayList<Business>
    var startPos = 0
    var name = ""
    var flagSearch = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        list = ArrayList()
        adapter = MainBusinessAdapter(arrayListOf(), this)
        binding.mainAdapter = adapter

        binding.edtName.setOnEditorActionListener(object : TextView.OnEditorActionListener {
            override fun onEditorAction(p0: TextView?, actionId: Int, p2: KeyEvent?): Boolean {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    flagSearch = true
                    name = binding.edtName.text.toString()
                    mainViewModel.getBusinessResponse(0, name)
                    return true
                }
                return false
            }
        })

        binding.edtName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0?.length == 0) {
                    flagSearch = true
                    name = p0.toString()
                    mainViewModel.getBusinessResponse(0, "")
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })

        mainViewModel.getBusinessResponse(0, "")

        setObserveBusiness()
        addScrollerListener()
    }


    fun addScrollerListener() {
        binding.recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val firstvisibleItem =
                    (binding.recyclerView.getLayoutManager() as LinearLayoutManager).findFirstVisibleItemPosition()
                val visibleItems =
                    (binding.recyclerView.getLayoutManager() as LinearLayoutManager).getChildCount() //total visible
                val totalItemCount =
                    (binding.recyclerView.getLayoutManager() as LinearLayoutManager).getItemCount() //the total
                val lastItem = firstvisibleItem + visibleItems
                if (totalItemCount != totalBusiness && totalItemCount < totalBusiness) {
                    if (lastItem == totalItemCount) {
                        val listCount = list.size
                        if (totalBusiness > listCount && totalBusiness > 0 && isLoading == false) {
                            isLoading = true
                            val rest_count = totalBusiness - listCount

                            if ((listCount != totalBusiness) && (rest_count != 0))
                                mainViewModel.getBusinessResponse(listCount, name)
                            startPos = listCount
                        }
                    }
                }
            }
        })
    }


    fun setObserveBusiness() {
        mainViewModel.businesses.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    it.data?.let { business ->
                        totalBusiness = business.total

                        renderList(business.businesses as ArrayList<Business>)
                    }
                    binding.recyclerView.visibility = View.VISIBLE
                }
                Status.ERROR -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
                Status.LOADING -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.recyclerView.visibility = View.GONE
                }
            }
        })
    }


    private fun renderList(lBusiness: ArrayList<Business>) {
        isLoading = false
        if (flagSearch) {
            list = ArrayList()
            flagSearch = false
        }
        if (lBusiness.size == 0) {
            binding.txtNoFound.visibility = View.VISIBLE
        } else {
            binding.txtNoFound.visibility = View.GONE
        }
        list.addAll(lBusiness)
        adapter.addData(list)
        adapter.notifyDataSetChanged()
        binding.recyclerView.layoutManager!!.scrollToPosition(startPos)
    }

    override fun onClickBusiness(id: String) {
        val mIntent = Intent(this, DetailsActivity::class.java)
        mIntent.putExtra("BusinessId", id)
        startActivity(mIntent)
    }
}