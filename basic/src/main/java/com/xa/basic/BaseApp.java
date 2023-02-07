package com.xa.basic;

import android.app.Application;

public abstract class BaseApp extends Application {
    @Override public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    /**
     * Application 初始化
     */
    public abstract void initModuleApp(Application application);

    /**
     * 所有 Application 初始化后的自定义操作
     */
    public abstract void initModuleData(Application application);
}
