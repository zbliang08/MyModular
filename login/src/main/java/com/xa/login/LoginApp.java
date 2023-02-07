package com.xa.login;

import android.app.Application;

import com.xa.basic.BaseApp;
import com.xa.common.ServiceFactory;

public class LoginApp extends BaseApp {
    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
