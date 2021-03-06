package com.xiaomi.factory.wifiadb.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.xiaomi.factory.lib_db.entity.WifiSignal;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WIFI_SIGNAL".
*/
public class WifiSignalDao extends AbstractDao<WifiSignal, Long> {

    public static final String TABLENAME = "WIFI_SIGNAL";

    /**
     * Properties of entity WifiSignal.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Time = new Property(1, String.class, "time", false, "TIME");
        public final static Property ApName = new Property(2, String.class, "apName", false, "AP_NAME");
        public final static Property IpAddress = new Property(3, String.class, "ipAddress", false, "IP_ADDRESS");
        public final static Property WifiChannel = new Property(4, int.class, "wifiChannel", false, "WIFI_CHANNEL");
        public final static Property WifiSignalStrength = new Property(5, int.class, "wifiSignalStrength", false, "WIFI_SIGNAL_STRENGTH");
        public final static Property WifiFrequencyBand = new Property(6, int.class, "wifiFrequencyBand", false, "WIFI_FREQUENCY_BAND");
    }


    public WifiSignalDao(DaoConfig config) {
        super(config);
    }
    
    public WifiSignalDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WIFI_SIGNAL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TIME\" TEXT," + // 1: time
                "\"AP_NAME\" TEXT," + // 2: apName
                "\"IP_ADDRESS\" TEXT," + // 3: ipAddress
                "\"WIFI_CHANNEL\" INTEGER NOT NULL ," + // 4: wifiChannel
                "\"WIFI_SIGNAL_STRENGTH\" INTEGER NOT NULL ," + // 5: wifiSignalStrength
                "\"WIFI_FREQUENCY_BAND\" INTEGER NOT NULL );"); // 6: wifiFrequencyBand
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WIFI_SIGNAL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WifiSignal entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(2, time);
        }
 
        String apName = entity.getApName();
        if (apName != null) {
            stmt.bindString(3, apName);
        }
 
        String ipAddress = entity.getIpAddress();
        if (ipAddress != null) {
            stmt.bindString(4, ipAddress);
        }
        stmt.bindLong(5, entity.getWifiChannel());
        stmt.bindLong(6, entity.getWifiSignalStrength());
        stmt.bindLong(7, entity.getWifiFrequencyBand());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WifiSignal entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(2, time);
        }
 
        String apName = entity.getApName();
        if (apName != null) {
            stmt.bindString(3, apName);
        }
 
        String ipAddress = entity.getIpAddress();
        if (ipAddress != null) {
            stmt.bindString(4, ipAddress);
        }
        stmt.bindLong(5, entity.getWifiChannel());
        stmt.bindLong(6, entity.getWifiSignalStrength());
        stmt.bindLong(7, entity.getWifiFrequencyBand());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public WifiSignal readEntity(Cursor cursor, int offset) {
        WifiSignal entity = new WifiSignal( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // time
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // apName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ipAddress
            cursor.getInt(offset + 4), // wifiChannel
            cursor.getInt(offset + 5), // wifiSignalStrength
            cursor.getInt(offset + 6) // wifiFrequencyBand
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WifiSignal entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTime(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setApName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIpAddress(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setWifiChannel(cursor.getInt(offset + 4));
        entity.setWifiSignalStrength(cursor.getInt(offset + 5));
        entity.setWifiFrequencyBand(cursor.getInt(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(WifiSignal entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(WifiSignal entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(WifiSignal entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
