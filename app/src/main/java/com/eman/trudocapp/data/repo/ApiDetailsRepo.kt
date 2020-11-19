package com.eman.trudocapp.data.repo

import com.eman.trudocapp.data.ApiDetailsHelper
import com.eman.trudocapp.data.ApiService
import com.eman.trudocapp.domain.model.Business
import javax.inject.Inject

class ApiDetailsRepo @Inject constructor(private val apiService: ApiService ) : ApiDetailsHelper {

    override suspend fun getBusinessDetails(id: String): Business =
        apiService.getBusinessDetails(id)




}