package com.eman.trudocapp.data.repo

import com.eman.trudocapp.data.api.ApiService
import com.eman.trudocapp.domain.model.BusinessAll
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiBusinessRepo @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getBusiness(offset: Int, term: String): Flow<Resource<BusinessAll>> {
        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val business = apiService.getBusiness(offset, term)
                Resource.success(business)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }
}