package com.example.coroutinedemo.userlist.data.api

import com.example.coroutinedemo.userlist.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}