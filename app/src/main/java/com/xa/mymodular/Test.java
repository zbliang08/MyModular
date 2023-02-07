package com.xa.mymodular;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xa.login.UserServiceImpl;

public class Test {
    @Autowired
    UserServiceImpl helloService;

    public Test(Context context) {
        ARouter.getInstance().inject(this);
    }

    public String getName(){
        return helloService.getFace();
    }
}
