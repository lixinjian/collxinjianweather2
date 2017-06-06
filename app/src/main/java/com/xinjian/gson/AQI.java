package com.xinjian.gson;

/**
 * Created by Administrator on 2017/6/6 0006.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;//空气质量指数
        public String pm25;//PM2.5 1小时平均值(ug/m³)
        public String qlty;   //空气质量类别，共六个级别，分别：优，良，轻度污染，中度污染，重度污染，严重污染
    }
}
