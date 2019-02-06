package com.restaurant.entity;

public class Food {
    private String id;
    private String name;
    private String date;
    private String security;
    private String foodType;
    private String num;
    private String mark;

    public Food(String id) {
        this.id = id;
    }

    public Food(String name, String date, String security, String foodType, String num) {
        this.name = name;
        this.date = date;
        this.security = security;
        this.foodType = foodType;
        this.num = num;
    }

    public Food(String name, String date, String security, String foodType, String num, String mark) {
        this.name = name;
        this.date = date;
        this.security = security;
        this.foodType = foodType;
        this.num = num;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", security='" + security + '\'' +
                ", foodType='" + foodType + '\'' +
                ", num='" + num + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
