package com.eman.trudocapp.domain.model

import com.squareup.moshi.Json

data class Location(
    @Json(name = "address1")
    val address1: String = "",

    @Json(name = "city")
    val city: String = "")