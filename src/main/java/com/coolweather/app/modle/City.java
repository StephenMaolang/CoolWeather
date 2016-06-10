package com.coolweather.app.modle;

/**
 * Created by Administrator on 2016/6/9.
 */
public class City {
    private String cityName;
    private String cityCode;
    private int id;
    private int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
