package com.xa.common

import com.alibaba.android.arouter.facade.template.IProvider

interface UserService: IProvider {
    fun getUid():String?
    fun getName():String?
    fun getFace():String?
    fun setUser(name:String, face:String, uid:String)
}