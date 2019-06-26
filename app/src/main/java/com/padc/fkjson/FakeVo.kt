package com.padc.fkjson

import com.google.gson.annotations.Expose
import com.google.gson.internal.ObjectConstructor

data class FakeVo(
    @Expose
    val id:Int,
    @Expose
    val userId: Int,
    @Expose
    val title: String,
    @Expose
    val body: String
)
