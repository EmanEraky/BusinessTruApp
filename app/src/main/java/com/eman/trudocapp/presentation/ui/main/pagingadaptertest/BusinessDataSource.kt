package com.eman.trudocapp.presentation.ui.main.pagingadaptertest

import android.util.Log
import androidx.paging.ItemKeyedDataSource
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.domain.usecases.getMainBusinessUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext


class BusinessDataSource
@Inject constructor(
     coroutineContext: CoroutineContext,
    val mainRepositoryUseCase: getMainBusinessUseCase
) : ItemKeyedDataSource<String, Business>() {


    private val job = Job()
    private val scope = CoroutineScope(coroutineContext + job)

    override fun getKey(item: Business): String {
        return item.id
    }

    override fun loadInitial(
        params: LoadInitialParams<String>,
        callback: LoadInitialCallback<Business>
    ) {

        scope.launch {
            try {
                val response = mainRepositoryUseCase.getBusiness(params.requestedLoadSize, "")


                val initKey = params.requestedInitialKey ?: 0
                val size = params.requestedLoadSize



                callback.onResult(BussinessData.getIncreaseItems(initKey as String, size))


            } catch (exception: Exception) {
                Log.e("PostsDataSource", "Failed to fetch data!")
            }

        }
    }

    override fun loadAfter(params: LoadParams<String>, callback: LoadCallback<Business>) {

        scope.launch {
            try {
                val response =
                    mainRepositoryUseCase.getBusiness(params.requestedLoadSize, params.key)

                val previousLatestKey = params.key
                val size = params.requestedLoadSize


                val newKey = previousLatestKey + 1

                callback.onResult(BussinessData.getIncreaseItems(newKey, size))

            } catch (exception: Exception) {
                Log.e("PostsDataSource", "Failed to fetch data!")
            }
        }
    }

    override fun loadBefore(params: LoadParams<String>, callback: LoadCallback<Business>) {


        scope.launch {
            try {
                val response =
                    mainRepositoryUseCase.getBusiness(params.requestedLoadSize, params.key)



                val previousFirstKey = params.key
                val size = params.requestedLoadSize

                callback.onResult(BussinessData.getReduceItems(previousFirstKey.toInt(), size))

            } catch (exception: Exception) {
                Log.e("PostsDataSource", "Failed to fetch data!")
            }
        }
    }


}