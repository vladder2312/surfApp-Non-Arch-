package com.example.myapplication.models
import com.google.gson.annotations.SerializedName

data class MemeDto (
    @SerializedName("id") val id : Long,
    @SerializedName("title") val title : String,
    @SerializedName("description") val description : String,
    @SerializedName("isFavorite") val isFavorite : Boolean,
    @SerializedName("createdDate") val createdDate : String,
    @SerializedName("photoUtl") val photoUtl : String
)