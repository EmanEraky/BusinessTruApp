package com.eman.trudocapp.data.repo

import com.eman.trudocapp.data.api.ApiService
import com.eman.trudocapp.domain.model.BusinessAll
import javax.inject.Inject

class ApiBusinessRepo @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getBusiness(offset: Int, term: String): BusinessAll =
        apiService.getBusiness(offset, term)


}