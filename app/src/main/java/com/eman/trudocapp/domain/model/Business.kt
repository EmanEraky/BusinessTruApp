package com.eman.trudocapp.domain.model

import com.squareup.moshi.Json


data class Business(
    @Json(name = "id")
    val id: String = "",

    @Json(name = "name")
    val name: String = "",

    @Json(name = "image_url")
    val image_url: String = "",

    @Json(name = "category")
    val categories: MutableList<Categories> = mutableListOf(),

    @Json(name = "price")
    val price: String = "",

    @Json(name = "phone")
    val phone: String = "",

    @Json(name = "display_phone")
    val display_phone: String = "",

    @Json(name = "rating")
    val rating: Float = 0f,

    @Json(name = "review_count")
    val review_count: Int = 0,


    @Json(name = "location")
    val location: Location = Location(),

    ) {


}