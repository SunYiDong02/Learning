package com.linda.eyepetizer_kotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.linda.lib_common.utils.NetworkUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text = "网络是否可用+${NetworkUtil.isNetworkAvailable2(this)}"
        initView()
    }

    private fun initView() {
        text.setOnClickListener {
            Log.d("111", "发起了跳转")

//            ARouter.getInstance().build(RouterPaths.HOME_ACTIVITY)
//                .navigation()
        }
        btn_arouter.setOnClickListener {
            Log.d("111", "发起了跳转")
            Toast.makeText(this, "xxxx", Toast.LENGTH_SHORT)
        }
    }
}