package com.gluthfi.sbdm_retroclient.custom

import com.gluthfi.sbdm_retroclient.model.MyModel
import retrofit2.Call
import retrofit2.http.GET

interface MyServices {
    @GET("posts")
    fun getPost(): Call<List<MyModel>>
}