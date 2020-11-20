package com.eman.trudocapp.domain.usecases

import com.eman.trudocapp.data.repo.ApiHelper
import javax.inject.Inject

class getMainBusinessUseCase @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getBusiness(offset: Int, term: String) =
        apiHelper.getBusiness(offset, term)


}