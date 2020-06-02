package com.clash.design.activity

import android.app.Activity
import android.os.Bundle
import com.clash.design.R

/**
 * Copyright @ 2019 FUXIN All rights reserved.
 * @class name: MainActivty
 * @class describe:
 * @author: fuxin
 * @date: 2020/6/2 5:19 PM
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_activity)
    }
}