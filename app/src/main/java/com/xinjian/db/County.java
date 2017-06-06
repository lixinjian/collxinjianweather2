package com.xinjian.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/11 0011.
 * 县  实体类
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县的名字
    private String weatherId;//天气的ID
    private int cityId;//城市的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
