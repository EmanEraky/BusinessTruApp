package com.eman.trudocapp.data.repo

import com.eman.trudocapp.data.api.ApiService
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiDetailsRepo @Inject constructor(private val apiService: ApiService) : ApiDetailsHelper {


    override suspend fun getBusinessDetails(id: String): Flow<Resource<Business>> {

        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val business = apiService.getBusinessDetails(id)
                Resource.success(business)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }


}