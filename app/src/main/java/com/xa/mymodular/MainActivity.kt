package com.xa.mymodular

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.xa.common.RouterConstance
import com.xa.login.UserServiceImpl
import com.xa.mylibrary.Fuck
import com.xa.testmaven.XTest

@Route(path = "/router/MainActivity")
class MainActivity : AppCompatActivity() {
//    @Autowired
//    @Autowired(name = RouterConstance.login_service)
//    lateinit var userService: UserServiceImpl
val userService = ARouter.getInstance().build(RouterConstance.login_service).navigation() as UserServiceImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ARouter.getInstance().inject(this)

        findViewById<Button>(com.xa.login.R.id.btn_login).setOnClickListener {
//            startActivity(Intent(this, LoginActivity2::class.java))

//            ARouter.getInstance().build(RouterConstance.login_2).navigation(this)

            ARouter.getInstance().build(RouterConstance.login_2).withString("arg", "测试名字数据")
                .navigation(this, 123,
                    object : NavigationCallback {
                        override fun onFound(postcard: Postcard?) {
                            Log.d("aaa", "onFound ${postcard?.extras}  ${postcard.toString()}")
                        }

                        override fun onLost(postcard: Postcard?) {
                            Log.d("aaa", "onLost ${postcard?.extras}  ${postcard.toString()}")
                        }

                        override fun onArrival(postcard: Postcard?) {
                            Log.d("aaa", "onArrival ${postcard?.extras}  ${postcard.toString()}")
                        }

                        override fun onInterrupt(postcard: Postcard?) {
                            Log.d("aaa", "onInterrupt ${postcard?.extras}  ${postcard.toString()}")
                        }
                    })
        }

    }

    override fun onResume() {
        super.onResume()
        Log.v("aaa", "isLogin = "+ com.xa.common.ServiceFactory.getInstance().loginService.isLogin())



        Log.v("aaa", "user = "+ userService.getFace())

//        Log.v("aaa", "user = "+ Test(this).getName())

        XTest().show()
        Fuck().fangfang()
//        MyTest()
    }
}