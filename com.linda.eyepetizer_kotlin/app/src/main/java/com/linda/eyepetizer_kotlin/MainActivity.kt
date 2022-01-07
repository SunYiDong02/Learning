package com.linda.eyepetizer_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.linda.lib_common.utils.NetworkUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text = "网络是否可用+${NetworkUtil.isNetworkAvailable2(this)}"
//        text.setOnClickListener {
//            ARouter.getInstance().build(RouterPaths.DAILY_FRAGMENT).navigation() as Fragment
//        }
    }
}