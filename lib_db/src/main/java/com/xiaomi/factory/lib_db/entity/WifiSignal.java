package com.xiaomi.factory.lib_db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Doctor on 2020/3/1.
 */
@Entity
public class WifiSignal {

    @Id(autoincrement = true)
    Long id;

    /**
     * 标明采集到数据的时间
     */
    String time;

    /**
     * 标明连接的AP名
     */
    String apName;

    /**
     * 标明手机的IP地址
     */
    String ipAddress;

    /**
     * 标明wifi的channel
     */
    int wifiChannel;

    /**
     * 标明wifi信号强度
     */
    int wifiSignalStrength;

    /**
     * 标明wifi的频段，0是2.4G， 1是5G
     */
    int wifiFrequencyBand;

    @Generated(hash = 109567574)
    public WifiSignal(Long id, String time, String apName, String ipAddress,
            int wifiChannel, int wifiSignalStrength, int wifiFrequencyBand) {
        this.id = id;
        this.time = time;
        this.apName = apName;
        this.ipAddress = ipAddress;
        this.wifiChannel = wifiChannel;
        this.wifiSignalStrength = wifiSignalStrength;
        this.wifiFrequencyBand = wifiFrequencyBand;
    }

    @Generated(hash = 969729819)
    public WifiSignal() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getApName() {
        return this.apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getWifiChannel() {
        return this.wifiChannel;
    }

    public void setWifiChannel(int wifiChannel) {
        this.wifiChannel = wifiChannel;
    }

    public int getWifiSignalStrength() {
        return this.wifiSignalStrength;
    }

    public void setWifiSignalStrength(int wifiSignalStrength) {
        this.wifiSignalStrength = wifiSignalStrength;
    }

    public int getWifiFrequencyBand() {
        return this.wifiFrequencyBand;
    }

    public void setWifiFrequencyBand(int wifiFrequencyBand) {
        this.wifiFrequencyBand = wifiFrequencyBand;
    }
}
