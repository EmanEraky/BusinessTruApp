package com.eman.trudocapp.domain.usecases

import com.eman.trudocapp.data.ApiHelper
import javax.inject.Inject

class getMainBusinessUseCase @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getBusiness(location: String, limit: Int, offset: Int) =
        apiHelper.getBusiness(location, limit, offset)


}