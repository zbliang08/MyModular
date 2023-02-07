package com.xa.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/xa/common/UserService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "getFace", "", "getName", "getUid", "setUser", "", "name", "face", "uid", "common_debug"})
public abstract interface UserService extends com.alibaba.android.arouter.facade.template.IProvider {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUid();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getFace();
    
    public abstract void setUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String face, @org.jetbrains.annotations.NotNull()
    java.lang.String uid);
}