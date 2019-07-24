package com.company;

public class BatWeather {
    private String date;
    private String time;
    private String opponent;
    private String high;
    private String low;

    BatWeather (String date, String time, String opponent, String high, String low) {
        this.date = date;
        this.time = time;
        this.opponent = opponent;
        this.high = high;
        this.low = low;

    }

    @Override
    public String toString() {
        return date + ", " + time + ", " + opponent + ", " + high + ", " + low;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
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
