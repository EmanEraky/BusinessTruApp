package com.eman.trudocapp.domain.usecases

import com.eman.trudocapp.data.ApiDetailsHelper
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class getDetailsBusinessUseCase @Inject constructor(private val apiDetailsHelper: ApiDetailsHelper) {

    suspend fun execute(id:String) = apiDetailsHelper.getBusinessDetails(id)
}