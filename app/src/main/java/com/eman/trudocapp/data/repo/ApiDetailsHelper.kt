package com.eman.trudocapp.data.repo

import com.eman.trudocapp.domain.model.Business

interface ApiDetailsHelper {
    suspend fun getBusinessDetails(id: String): Business

}