package com.xa.login

import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Route
import com.xa.basic.BaseActivity
import com.xa.common.RouterConstance

@Route(path = RouterConstance.login_1)
class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            com.xa.common.ServiceFactory.getInstance().loginService.setLogin(true)
            Log.v("aaa", "isLogin = "+ com.xa.common.ServiceFactory.getInstance().loginService.isLogin())
        }
        Log.v("aaa", "isLogin = "+ com.xa.common.ServiceFactory.getInstance().loginService.isLogin())
    }
}