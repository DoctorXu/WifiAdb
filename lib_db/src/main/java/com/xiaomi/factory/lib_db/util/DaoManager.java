package com.xiaomi.factory.lib_db.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.xiaomi.factory.wifiadb.db.DaoMaster;
import com.xiaomi.factory.wifiadb.db.DaoSession;

/**
 * Created by Doctor on 2020/3/1.
 */
public class DaoManager {

    private static final String WIFI_ADB_DB_NAME = "wifiadb.db";
    private static DaoManager instance;
    private DaoSession daoSession;
    public void initDb(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context.getApplicationContext(), WIFI_ADB_DB_NAME, null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster master = new DaoMaster(db);
        daoSession = master.newSession();
    }

    /**
     * @desc
     * @author Administrator
     * @time 2020/3/1 19:00
     * @param
     * @return daoSession对象
     */
    public DaoSession getDaoSession() {
        return daoSession;
    }

    public static DaoManager getInstance(){
        if (instance == null) {
            synchronized (DaoManager.class) {
                if (instance == null) {
                    instance = new DaoManager();
                }
            }
        }

        return instance;
    }
}
