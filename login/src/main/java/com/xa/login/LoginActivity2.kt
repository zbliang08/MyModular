package com.xa.login

import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.xa.basic.BaseActivity
import com.xa.common.RouterConstance
import com.xa.common.ServiceFactory

@Route(path = RouterConstance.login_2)
class LoginActivity2 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            ServiceFactory.getInstance().loginService.setLogin(true)
            Log.v("aaa", "isLogin = "+ com.xa.common.ServiceFactory.getInstance().loginService.isLogin())


            val userService = ARouter.getInstance().build(RouterConstance.login_service).navigation() as UserServiceImpl
            userService.setUser("aaa","bbb","ccc")

        }
        Log.v("aaa", "isLogin = "+ com.xa.common.ServiceFactory.getInstance().loginService.isLogin())

        val a = intent.getStringExtra("uid")
        val b = intent.getStringExtra("qwe")
        Log.v("aaa", "a=$a  b=$b")
    }
}