package com.eman.trudocapp.presentation.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eman.trudocapp.domain.model.BusinessAll
import com.eman.trudocapp.domain.usecases.getMainBusinessUseCase
import com.eman.trudocapp.utils.NetworkHelper
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor
    (val mainRepositoryUseCase: getMainBusinessUseCase, val networkHelper: NetworkHelper) :
    ViewModel() {
    private val _business = MutableLiveData<Resource<BusinessAll>>()

    val businesses: MutableLiveData<Resource<BusinessAll>>
        get() = _business


    fun getBusinessResponse(offset: Int, term: String) {
        viewModelScope.launch {
            _business.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepositoryUseCase.getBusiness(offset, term).collect {
                    _business.postValue(it)
                }
            } else _business.postValue(Resource.error("No internet connection", null))
        }
    }


}