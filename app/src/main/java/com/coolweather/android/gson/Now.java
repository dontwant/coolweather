package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LI  Xiao   Kun on 2019/2/19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        public String info;
    }
}
