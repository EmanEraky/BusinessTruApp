package com.eman.trudocapp.presentation.ui.main.pagingadaptertest

import androidx.paging.DataSource
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.domain.usecases.getMainBusinessUseCase
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class BusinessDataFactory @Inject constructor(val coroutineContext: CoroutineContext,
                                              val mainRepositoryUseCase: getMainBusinessUseCase
) : DataSource.Factory<String, Business>() {

    override fun create(): DataSource<String, Business> {
        return BusinessDataSource(coroutineContext ,mainRepositoryUseCase)
    }
}