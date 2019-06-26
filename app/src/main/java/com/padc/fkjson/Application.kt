package com.padc.fkjson

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        setUpTestApi()
    }

    lateinit var theApi: TestApi

    private fun networkHelper(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


        fun setUpTestApi() {
            theApi = networkHelper().create(TestApi::class.java)
        }



}