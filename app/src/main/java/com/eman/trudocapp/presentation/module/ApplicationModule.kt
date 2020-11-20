package com.eman.trudocapp.presentation.module

import com.eman.trudocapp.BuildConfig
import com.eman.trudocapp.data.api.ApiService
import com.eman.trudocapp.data.repo.ApiDetailsRepo
import com.eman.trudocapp.data.repo.ApiBusinessRepo
import com.eman.trudocapp.data.repo.ApiDetailsHelper
import com.eman.trudocapp.data.repo.ApiHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {

    @Provides
    fun provideBaseUrl(): String = BuildConfig.BASE_URL


    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder().addInterceptor { chain ->
            val original = chain.request()
            val requestBuilder = original.newBuilder()
                .header("Authorization",  BuildConfig.API_Key)
                .header("Content-Type", "application/json") // <-- this is the important line
            val request = requestBuilder.build()
            chain.proceed(request)
        }.build()


    } else OkHttpClient
        .Builder()
        .build()


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .build()


    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(apiHelper: ApiBusinessRepo): ApiHelper = apiHelper


    @Provides
    @Singleton
    fun provideApiBusinessDetails(apiDetailsHelper: ApiDetailsRepo): ApiDetailsHelper = apiDetailsHelper
}