package com.xa.common;

import android.util.Log;

import com.xa.TestActivity;

public class ServiceFactory {

    private ILoginService loginService;

    /**
     * 禁止外部创建 ServiceFactory 对象
     */
    private ServiceFactory() {
    }

    /**
     * 通过静态内部类方式实现 ServiceFactory 的单例
     */
    public static ServiceFactory getInstance() {
        return Inner.serviceFactory;
    }

    private static class Inner {
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }


//    ------------------------LoginService------------------------
    /**
     * 接收 Login 组件实现的 Service 实例
     */
    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * 返回 Login 组件的 Service 实例
     */
    public ILoginService getLoginService() {
        Log.v("aaa", "b="+TestActivity.Companion.getA());
        if (loginService == null) {
            loginService = new EmptyLoginService();
        }
        return loginService;
    }

//    ------------------------LoginService------------------------


}
