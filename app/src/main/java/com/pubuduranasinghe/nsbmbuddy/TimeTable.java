package com.pubuduranasinghe.nsbmbuddy;

/**
 * Created by Pubudu on 2017-05-14.
 */

public class TimeTable {
    String batch;
    String date;
    String hall;
    String lecturer;
    String module;
    String time;
    String batch_date;

    public TimeTable() {
    }

    public String getBatch_date() {
        return batch_date;
    }

    public String getBatch() {
        return batch;
    }

    public String getDate() {
        return date;
    }

    public String getHall() {
        return hall;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getModule() {
        return module;
    }

    public String getTime() {
        return time;
    }

    public TimeTable(String batch, String date) {
        this.batch = batch;
        this.date = date;
    }
}
