package com.padc.fkjson

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.nio.file.attribute.PosixFileAttributeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val app = application as Application
        val post = FakeVo(1, 1, "hello ucsy", "This is ucsy retrofit test")
        /* app.theApi.uploadPost(post).enqueue(object : Callback<FakeVo> {
             override fun onFailure(call: Call<FakeVo>?, t: Throwable?) {

             }

             override fun onResponse(call: Call<FakeVo>?, response: Response<FakeVo>?) {
                 Log.d("response id", response!!.body().id.toString())
                 Log.d("response userid", "${response.body().userId}")
                 Log.d("response title",response.body().title)
             }
         })*/

        app.theApi.getPost(10).enqueue(object : Callback<MutableList<FakeVo>> {
            override fun onFailure(call: Call<MutableList<FakeVo>>?, t: Throwable?) {
                Log.d("get", t!!.message)
            }

            override fun onResponse(call: Call<MutableList<FakeVo>>?, response: Response<MutableList<FakeVo>>?) {
                Log.d("get id", response!!.body()[0].id.toString())
                Log.d("get userid", "${response.body()[0].userId}")
                Log.d("get title", response.body()[0].title)
            }
        })

    }
}
