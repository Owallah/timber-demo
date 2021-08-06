package com.example.timberdemo;

import android.app.Application;

import timber.log.Timber;

public class TimberDemoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }
}
