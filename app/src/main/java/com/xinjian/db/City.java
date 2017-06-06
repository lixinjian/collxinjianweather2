package com.xinjian.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/11 0011.
 * 城市的实体类
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//城市名称
    private int cityCode;//城市代号
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
