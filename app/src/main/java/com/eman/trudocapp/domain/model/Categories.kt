package com.eman.trudocapp.domain.model

import com.squareup.moshi.Json

data class Categories(
    @Json(name = "alias")
    val alias: String = "",

    @Json(name = "title")
    val title: String = ""
)