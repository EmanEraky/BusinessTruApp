package com.eman.trudocapp.data.repo

import com.eman.trudocapp.data.ApiHelper
import com.eman.trudocapp.data.ApiService
import com.eman.trudocapp.domain.model.BusinessAll
import javax.inject.Inject

class ApiBusinessRepo @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getBusiness(location: String, limit: Int, offset: Int): BusinessAll
            = apiService.getBusiness(location,limit,offset)


}