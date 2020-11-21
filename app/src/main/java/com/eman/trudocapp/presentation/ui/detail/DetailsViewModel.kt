package com.eman.trudocapp.presentation.ui.detail

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.domain.usecases.getDetailsBusinessUseCase
import com.eman.trudocapp.utils.NetworkHelper
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class DetailsViewModel @ViewModelInject constructor(
    var detailsUseCase: getDetailsBusinessUseCase, val networkHelper: NetworkHelper,
) : ViewModel() {


    private val _business = MutableLiveData<Resource<Business>>()
    var id = ""
    val business: MutableLiveData<Resource<Business>>
        get() = _business


    fun getDetailsBusiness(id: String) {
        viewModelScope.launch {
            if (networkHelper.isNetworkConnected()) {
                detailsUseCase.execute(id).collect {
                    _business.postValue(it)
                }
            } else {
                _business.postValue(Resource.error("No internet connection", null))
            }

        }
    }

}