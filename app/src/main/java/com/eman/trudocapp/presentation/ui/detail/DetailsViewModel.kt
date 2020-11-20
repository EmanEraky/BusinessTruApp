package com.eman.trudocapp.presentation.ui.detail

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.domain.usecases.getDetailsBusinessUseCase
import com.eman.trudocapp.utils.NetworkHelper
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.launch

class DetailsViewModel @ViewModelInject constructor(
    var detailsUseCase: getDetailsBusinessUseCase, val networkHelper: NetworkHelper, ) : ViewModel() {


    private val _business = MutableLiveData<Resource<Business>>()
    var id = ""
    val business: MutableLiveData<Resource<Business>>
        get() = _business

    fun getDetailsBusiness(id: String) {
        viewModelScope.launch {
            _business.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                try {
                    val result = detailsUseCase.execute(id)
                    _business.postValue(Resource.success(result))
                } catch (e: Exception) {
                    _business.postValue(Resource.error(e.message.toString(), null))
                }
            } else {
                _business.postValue(Resource.error("No internet connection", null))
            }
        }
    }




}