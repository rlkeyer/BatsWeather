package com.company;

public class ScheduleData {
    private String date;
    private String time;
    private String opponent;

    ScheduleData (String date, String time, String opponent) {
        this.date = date;
        this.time = time;
        this.opponent = opponent;
    }

    @Override
    public String toString() {
        return date + ", " + time + ", " + opponent;
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
}
