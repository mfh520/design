package com.restaurant.entity;

public class Menu {
    private int id;
    private String name;
    private String type;
    private double price;
    private String season;

    public Menu() {
    }

    public Menu(Integer id, String name, String type, Double price, String season) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.season = season;
    }

    public Menu(String name, String type, double price, String season) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.season = season;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
