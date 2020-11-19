package com.eman.trudocapp.presentation.ui.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.eman.trudocapp.R
import com.eman.trudocapp.databinding.ActivityDetailsBinding
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.utils.Status
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    private val detailsViewModel: DetailsViewModel by viewModels()

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_details)

        intent.getStringExtra("BusinessId")?.let { detailsViewModel.getDetailsBusiness(it) }

        binding.floatingShare.setOnClickListener {
            shareBusiness()
        }
        binding.imgPhone.setOnClickListener {
            mPhoneCall(binding.businessDetail!!.phone)
        }
        getObserveDetails()
    }

    fun getObserveDetails() {
        detailsViewModel.business.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    it.data?.let { renderData(it) }
                }
                Status.ERROR -> {
                    binding.progressBar.visibility = View.GONE
                }
                Status.LOADING ->
                    binding.progressBar.visibility = View.VISIBLE
            }
        })
    }

    fun renderData(data: Business) {
        if (!data.phone.equals("")) {
            binding.imgPhone.visibility = View.VISIBLE
        } else {
            binding.imgPhone.visibility = View.INVISIBLE
        }
        binding.businessDetail = data
    }

    fun shareBusiness() {
        val data = binding.businessDetail!!
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(
            Intent.EXTRA_TEXT, ("Display Phone : " + data.display_phone + "\n Name : " +
                    data.name + " " + data.rating + "  \n Review Count :" + data.review_count
                    + "\n Address :" + data.location.address1)
        )
        startActivity(Intent.createChooser(intent, "share"))
    }

    fun mPhoneCall(phone :String){
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phone")
        startActivity(intent)
    }
}