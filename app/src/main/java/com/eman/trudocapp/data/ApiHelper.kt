package com.eman.trudocapp.data

import com.eman.trudocapp.domain.model.BusinessAll

interface ApiHelper {
    suspend fun getBusiness(location: String, limit: Int, offset: Int): BusinessAll


}