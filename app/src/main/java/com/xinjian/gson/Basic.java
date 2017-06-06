package com.xinjian.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/6/6 0006.
 */

public class Basic {

    @SerializedName("city")//由于Json中的一些字段不太适合直接作为Java字段来命名，
    // 因此使用了@SerializedName注解的方式来让json字段和Java字段之间建立映射关系。
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
