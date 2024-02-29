package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sparkoutcommonlibrary.APIClientSample

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiClient:APIClientSample=APIClientSample()
        apiClient.getClient("https://www.google.com/api/")
    }
}