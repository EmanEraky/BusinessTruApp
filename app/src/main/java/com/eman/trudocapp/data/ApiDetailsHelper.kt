package com.eman.trudocapp.data

import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ApiDetailsHelper {

//    suspend fun getBusinessDetails(id: String): Flow<Resource<Business>>
    suspend fun getBusinessDetails(id: String):Business

}