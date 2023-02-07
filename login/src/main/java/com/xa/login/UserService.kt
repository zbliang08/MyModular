package com.xa.login

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
import com.xa.common.RouterConstance
import com.xa.common.UserService


@Route(path = RouterConstance.login_service)
class UserServiceImpl: UserService {
    override fun getUid(): String? {
        return nickUid
    }

    override fun getName(): String? {
        return nickName
    }

    override fun getFace(): String? {
        return nickFace
    }

    override fun setUser(name: String, face: String, uid: String) {
        nickName=name
        nickFace=face
        nickUid=uid
    }

    var nickName=""
    var nickFace=""
    var nickUid=""
    override fun init(context: Context?) {
//        nickName="我是测试"
//        nickFace="我是头像"
//        nickUid="10010"
    }
}