package com.xa.common

interface ILoginService {
    /*** 是否已经登录 ** @return  */
    fun isLogin(): Boolean
    fun setLogin(flag:Boolean)

    /*** 获取登录用户的 AccountId ** @return  */
    fun getAccountId(): String?
}