package com.xiaomi.factory.wifiadb.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.xiaomi.factory.lib_db.util.DaoManager;

/**
 * Created by Doctor on 2020/3/1.
 */
public class WifiAdbApplication extends Application {

    private boolean isDebug = true;

    private static final String WIFI_ADB_DB_NAME = "wifiadb.db";

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化

        // 初始化数据库
        DaoManager.getInstance().initDb(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}
