package com.xiaomi.factory.wifiadb.app;

import android.app.Application;

/**
 * Created by Doctor on 2020/3/1.
 */
public class WifiAdbApplication extends Application {

    private boolean isDebug = true;
    @Override
    public void onCreate() {
        super.onCreate();

    }
}
