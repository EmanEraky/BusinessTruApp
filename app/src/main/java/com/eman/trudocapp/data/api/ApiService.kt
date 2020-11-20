package com.eman.trudocapp.data.api

import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.domain.model.BusinessAll
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("search?location=NYC&limit=30")
    suspend fun getBusiness(@Query ("offset") offset :Int ,
                            @Query("term") term :String): BusinessAll

    @GET("{Id}")
    suspend fun getBusinessDetails(@Path("Id") Id :String): Business



}