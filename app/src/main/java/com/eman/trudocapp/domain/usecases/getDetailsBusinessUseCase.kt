package com.eman.trudocapp.domain.usecases

import com.eman.trudocapp.data.repo.ApiDetailsHelper
import javax.inject.Inject

class getDetailsBusinessUseCase @Inject constructor(private val apiDetailsHelper: ApiDetailsHelper) {

    suspend fun execute(id:String) = apiDetailsHelper.getBusinessDetails(id)
}