package com.eman.trudocapp.data.repo

import com.eman.trudocapp.domain.model.BusinessAll
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ApiHelper {
    suspend fun getBusiness(offset: Int,term :String): Flow<Resource<BusinessAll>>




}