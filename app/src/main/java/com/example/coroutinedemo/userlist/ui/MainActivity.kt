package com.example.coroutinedemo.userlist.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.coroutinedemo.databinding.ActivityMainBinding
import com.example.coroutinedemo.userlist.data.api.ApiHelper
import com.example.coroutinedemo.userlist.data.api.RetrofitBuilder
import com.example.coroutinedemo.userlist.viewmodel.MainViewModel
import com.example.coroutinedemo.userlist.viewmodel.ViewModelFactory
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

const val TAG = "main_activity"

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel> { ViewModelFactory(ApiHelper(RetrofitBuilder.apiService)) }

    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        lifecycleScope.launch {

            val data = async {
                getData()

            }

            val data2 = async {
                getData()
            }

            callingANpi(data.await())

            callingANpi(data.await())
        }

        lifecycleScope.run {


        }


    }


    suspend fun getData(): Deferred<String> {

        return "sss";
    }

    fun callingANpi(data: Deferred<String>) {

    }


}