package com.restaurant.entity;

public class Food {
    private int id;
    private String name;
    private String date;
    private int security;
    private String foodType;
    private int number;
    private String measure;
    private int usedFlag;

    public Food() {
    }

    public Food(int id, String name, String date, int security, String foodType, int number, String measure, int usedFlag) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.security = security;
        this.foodType = foodType;
        this.number = number;
        this.measure = measure;
        this.usedFlag = usedFlag;
    }

    public Food(String name, String date, int security, String foodType, int number, String measure, int usedFlag) {
        this.name = name;
        this.date = date;
        this.security = security;
        this.foodType = foodType;
        this.number = number;
        this.measure = measure;
        this.usedFlag = usedFlag;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", security='" + security + '\'' +
                ", foodType='" + foodType + '\'' +
                ", number='" + number + '\'' +
                ", measure='" + measure + '\'' +
                ", usedFlag='" + usedFlag + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public int getUsedFlag() {
        return usedFlag;
    }

    public void setUsedFlag(int usedFlag) {
        this.usedFlag = usedFlag;
    }


}
