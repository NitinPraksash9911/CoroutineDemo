package com.example.coroutinedemo.userlist.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.coroutinedemo.userlist.data.repository.MainRepository
import kotlinx.coroutines.Dispatchers

class MainViewModel(private var mainRepository: MainRepository) : ViewModel() {


    fun getUserList() = liveData(Dispatchers.IO) {
        emit(mainRepository.getUsers())
    }


}