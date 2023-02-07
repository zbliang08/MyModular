package com.xa.login;

import androidx.annotation.Nullable;

import com.xa.common.ILoginService;

public class LoginService implements ILoginService {
    private boolean mLogin = false;

    @Override
    public boolean isLogin() {
        return mLogin;
    }

    @Nullable
    @Override
    public String getAccountId() {
        return null;
    }

    @Override
    public void setLogin(boolean flag) {
        mLogin = flag;
    }
}
