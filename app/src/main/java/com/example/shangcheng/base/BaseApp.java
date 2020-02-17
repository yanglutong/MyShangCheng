package com.example.shangcheng.base;

import android.app.Application;

public class BaseApp extends Application {

    public static Application app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
