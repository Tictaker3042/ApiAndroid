package com.example.myapplication

import com.google.gson.annotations.SerializedName
import java.io.Serial

data class Class1(@SerializedName("_id") val id:String, @SerializedName("content") val content: String, @SerializedName("author") val author: String){


}