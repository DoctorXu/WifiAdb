package com.xiaomi.factory.wifiadb.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.alibaba.android.arouter.launcher.ARouter;
//import com.xiaomi.factory.wifiadb.db.DaoMaster;

/**
 * Created by Doctor on 2020/3/1.
 */
public class WifiAdbApplication extends Application {

    private boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }

    private void initGreenDao() {
        //DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(WifiAdbApplication.this, "wifiadb", null);
        //SQLiteDatabase db = helper.getWritableDatabase();

    }
}
