package com.anil.vidyakuldemo

import android.os.Bundle
import com.anil.vidyakuldemo.app.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeStatusBarColor(R.color.colorBlack)

    }
}