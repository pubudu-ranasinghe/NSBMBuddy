package com.pubuduranasinghe.nsbmbuddy;

/**
 * Created by Pubudu on 2017-05-14.
 */

public class Notifications {
    String date;
    String given_by;
    String notification;
    String time;

    public String getDate() {
        return date;
    }

    public String getGiven_by() {
        return given_by;
    }

    public String getNotification() {
        return notification;
    }

    public String getTime() {
        return time;
    }

    public Notifications(String date) {
        this.date = date;
    }

    public Notifications() {
    }
}
