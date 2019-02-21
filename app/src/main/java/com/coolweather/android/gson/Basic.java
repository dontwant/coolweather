package com.coolweather.android.gson;

import android.text.style.UpdateLayout;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LI  Xiao   Kun on 2019/2/19.
 */

public class Basic {
    @SerializedName("City")
    public String cityName;
    @SerializedName("id")
    public  String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateName;
    }
}
