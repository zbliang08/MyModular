package com.xa.mymodular

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.xa.TestActivity
import com.xa.common.RouterConstance
import com.xa.device.export.DevManager
import com.xa.farm.export.FarmManager
import com.xa.device.export.IDevice
import com.xa.farm.export.Isome
import com.xa.device.impl.DevApp
import com.xa.farm.impl.FarmApp
import com.xa.login.UserServiceImpl
//import com.xa.mylibrary.Fuck
//import com.xa.testmaven.XTest

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

//            ARouter.getInstance().build(RouterConstance.login_2).withString("arg", "测试名字数据")
//                .navigation(this, 123,
//                    object : NavigationCallback {
//                        override fun onFound(postcard: Postcard?) {
//                            Log.d("aaa", "onFound ${postcard?.extras}  ${postcard.toString()}")
//                        }
//
//                        override fun onLost(postcard: Postcard?) {
//                            Log.d("aaa", "onLost ${postcard?.extras}  ${postcard.toString()}")
//                        }
//
//                        override fun onArrival(postcard: Postcard?) {
//                            Log.d("aaa", "onArrival ${postcard?.extras}  ${postcard.toString()}")
//                        }
//
//                        override fun onInterrupt(postcard: Postcard?) {
//                            Log.d("aaa", "onInterrupt ${postcard?.extras}  ${postcard.toString()}")
//                        }
//                    })

            startActivity(Intent(this, TestActivity::class.java))
        }

        FarmApp().init()
        DevApp().init()
    }

    override fun onResume() {
        super.onResume()
        Log.v("aaa", "isLogin = "+ com.xa.common.ServiceFactory.getInstance().loginService.isLogin())



        Log.v("aaa", "user = "+ userService.getFace())

//        Log.v("aaa", "user = "+ Test(this).getName())

//        XTest().show()
//        Fuck().fangfang()
//        MyTest()

        val some:Isome? = FarmManager.getSome()
        Log.v("aaa", "some = $some")

        val dev: IDevice? = DevManager.getDevice()
        Log.v("aaa", "dev = $dev")

    }
}