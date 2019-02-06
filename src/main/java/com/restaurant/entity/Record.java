package com.restaurant.entity;

import java.util.Date;

public class Record {
    private String id;
    private String date;
    private String type;
    private String money;

    public Record(String id, String date, String type, String money) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.money = money;
    }

    public Record(String date, String type, String money) {
        this.date = date;
        this.type = type;
        this.money = money;
    }

    public Record() {
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", money='" + money + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
