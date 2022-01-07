package com.linda.module_home.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.linda.lib_common.constants.RouterPaths
import com.linda.module_home.R

@Route(path = RouterPaths.HOME_ACTIVITY)
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        ARouter.init(application)
    }
}