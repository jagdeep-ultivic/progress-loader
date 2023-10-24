package com.and.ploader.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.and.ploader.mylibrary.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("Dfggdf")
    }
}