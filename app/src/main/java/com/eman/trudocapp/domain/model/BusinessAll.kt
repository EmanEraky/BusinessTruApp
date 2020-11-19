package com.eman.trudocapp.domain.model

import com.squareup.moshi.Json

class BusinessAll {
    @Json(name = "businesses")
    val businesses = mutableListOf<Business>()

    @Json(name = "total")
    val total: Int = 0
}