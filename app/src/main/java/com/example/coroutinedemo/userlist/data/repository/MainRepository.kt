package com.example.coroutinedemo.userlist.data.repository

import com.example.coroutinedemo.userlist.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

}