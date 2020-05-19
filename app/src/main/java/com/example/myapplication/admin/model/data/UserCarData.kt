package com.example.myapplication.admin.model.data


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("brand")
    val brand: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("details")
    val details: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("number")
    val number: String,
    @SerializedName("userId")
    val userId: Int
)