package com.xinjian.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/6/6 0006.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public UV uv;

    /**
     * 运动指数
     */
    public class Sport {
        @SerializedName("txt")
        public String info;
    }

    /**
     * 洗车指数
     */
    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    /**
     * 舒适度指数
     */
    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    /**
     * 紫外线指数
     */
    public class UV {
        @SerializedName("txt")
        public String info;
    }
}
