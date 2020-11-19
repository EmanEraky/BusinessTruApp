package com.eman.trudocapp.data

import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.domain.model.BusinessAll
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("businesses/search")
    suspend fun getBusiness(@Query("location") location :String ,
                            @Query ("limit") limit :Int,
                            @Query ("offset") offset :Int, ): BusinessAll

    @GET("businesses/{Id}")
    suspend fun getBusinessDetails(@Path("Id") Id :String): Business


}