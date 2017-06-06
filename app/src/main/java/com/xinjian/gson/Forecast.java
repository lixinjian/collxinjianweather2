package com.xinjian.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/6/6 0006.
 */

public class Forecast {
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    public String hum;//相对湿度（%）
    public String pcpn;//降水量（mm）

    public Wind wind;

    public class Wind {
        public String dir;//风向
        public String sc;//风力
    }

    /**
     * 温度
     */
    public class Temperature {
        public String max;//最高温度
        public String min;//最低温度
    }

    public class More {
        @SerializedName("txt_d")
        public String info;//白天天气状况描述
    }

    /**
     * 天文数值
     */
    public class Astro {
        @SerializedName("mr")
        public String monthRise;//月出时间
        @SerializedName("ms")
        public String monthSet;//月落时间
        @SerializedName("sr")
        public String sunRise;//日出时间
        @SerializedName("ss")
        public String sunSet;//日落时间
    }
}
