
package io.leftshift.sample.parser;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("temp")
    @Expose
    public double temperature;
    @SerializedName("pressure")
    @Expose
    public int pressure;
    @SerializedName("humidity")
    @Expose
    public int humidity;
    @SerializedName("temp_min")
    @Expose
    public double tempMin;
    @SerializedName("temp_max")
    @Expose
    public double tempMax;

}
