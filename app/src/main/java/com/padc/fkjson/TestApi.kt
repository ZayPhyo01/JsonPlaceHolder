package com.padc.fkjson

import retrofit2.Call
import retrofit2.http.*

interface TestApi {

    @POST("posts")
    fun uploadPost(@Body postVo: FakeVo): Call<FakeVo>

    @GET("posts")
    fun getPost(@Query("id") id: Int): Call<MutableList<FakeVo>>

}