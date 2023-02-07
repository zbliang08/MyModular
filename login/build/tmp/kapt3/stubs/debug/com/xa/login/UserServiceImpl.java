package com.xa.login;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/login/UserSericice")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/xa/login/UserServiceImpl;", "Lcom/xa/common/UserService;", "()V", "nickFace", "", "getNickFace", "()Ljava/lang/String;", "setNickFace", "(Ljava/lang/String;)V", "nickName", "getNickName", "setNickName", "nickUid", "getNickUid", "setNickUid", "getFace", "getName", "getUid", "init", "", "context", "Landroid/content/Context;", "setUser", "name", "face", "uid", "login_debug"})
public final class UserServiceImpl implements com.xa.common.UserService {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nickName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nickFace = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nickUid = "";
    
    public UserServiceImpl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getFace() {
        return null;
    }
    
    @java.lang.Override()
    public void setUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String face, @org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNickName() {
        return null;
    }
    
    public final void setNickName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNickFace() {
        return null;
    }
    
    public final void setNickFace(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNickUid() {
        return null;
    }
    
    public final void setNickUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
}