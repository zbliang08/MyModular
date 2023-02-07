package com.xa.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/xa/common/ILoginService;", "", "getAccountId", "", "isLogin", "", "setLogin", "", "flag", "common_debug"})
public abstract interface ILoginService {
    
    /**
     * * 是否已经登录 ** @return
     */
    public abstract boolean isLogin();
    
    public abstract void setLogin(boolean flag);
    
    /**
     * * 获取登录用户的 AccountId ** @return
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getAccountId();
}