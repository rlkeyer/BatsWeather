package com.company;

public class WeatherData {
    private String date;
    private String high;
    private String low;

    WeatherData (String date, String high, String low) {
        this.date = date;
        this.high = high;
        this.low = low;
    }

    @Override
    public String toString() {
        return date + ", " + high + ", " + low;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }
}
