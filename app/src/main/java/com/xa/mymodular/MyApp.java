package com.xa.mymodular;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.xa.basic.AppConfig;
import com.xa.basic.BaseApp;

public class MyApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // Print log
            ARouter.openDebug();
        }
        ARouter.init(this);

        initComponentList();
    }

    //初始化组件
    //通过反射初始化
    private void initComponentList(){
        for (String moduleApp : AppConfig.moduleApps) {
            try {
                Class clazz = Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.onCreate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initModuleApp(Application application) {

    }

    @Override
    public void initModuleData(Application application) {

    }
}
