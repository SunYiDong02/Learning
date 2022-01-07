package com.linda.module_home.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.linda.module_home.R

//@Route(path = RouterPaths.HOME_ACTIVITY)
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}