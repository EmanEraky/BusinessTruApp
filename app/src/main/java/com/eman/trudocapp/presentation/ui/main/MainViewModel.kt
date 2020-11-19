package com.eman.trudocapp.presentation.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eman.trudocapp.domain.model.BusinessAll
import com.eman.trudocapp.domain.usecases.getMainBusinessUseCase
import com.eman.trudocapp.utils.NetworkHelper
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor
    (val mainRepositoryUseCase: getMainBusinessUseCase, val networkHelper: NetworkHelper) : ViewModel() {
    private val _business = MutableLiveData<Resource<BusinessAll>>()

    val businesses: MutableLiveData<Resource<BusinessAll>>
        get() = _business



    fun getBusinessResponse(offset :Int) {
        viewModelScope.launch {
            _business.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                try {
                    val result = mainRepositoryUseCase.getBusiness("NYC", 30, offset)
                    _business.postValue(Resource.success(result))
                } catch (e: Exception) {
                    _business.postValue(Resource.error(e.message.toString(), null))
                }

            } else _business.postValue(Resource.error("No internet connection", null))
        }
    }


}