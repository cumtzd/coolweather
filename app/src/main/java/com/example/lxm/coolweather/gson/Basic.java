package com.example.lxm.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LXM on 2017/2/6.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
