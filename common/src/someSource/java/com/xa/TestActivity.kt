package com.xa

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.xa.common.R
import com.xa.common.ServiceFactory

class TestActivity : AppCompatActivity() {
    companion object{
        val a = "bbb"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val a = ServiceFactory.getInstance().loginService
        Log.v("aaa", "a=$a")
    }
}