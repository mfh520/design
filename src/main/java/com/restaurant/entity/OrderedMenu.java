package com.restaurant.entity;

public class OrderedMenu {
    private int id;
    private int menuId;
    private String account;
    private String name;
    private String type;
    private double price;
    private String season;
    private String orderTime;
    private String useTime;
    private int number;


    public OrderedMenu(int id, int menuId, String account, String name, String type, double price, String season,
                       String orderTime, String useTime, int number) {
        this.id = id;
        this.menuId = menuId;
        this.account = account;
        this.name = name;
        this.type = type;
        this.price = price;
        this.season = season;
        this.orderTime = orderTime;
        this.useTime = useTime;
        this.number = number;
    }

    public OrderedMenu(int menuId, String account, String name, String type, double price, String season,
                       String orderTime, String useTime, int number) {
        this.menuId = menuId;
        this.account = account;
        this.name = name;
        this.type = type;
        this.price = price;
        this.season = season;
        this.orderTime = orderTime;
        this.useTime = useTime;
        this.number = number;
    }

    public OrderedMenu() {
    }

    @Override
    public String toString() {
        return "OrderedMenu{" +
                "id='" + id + '\'' +
                ", menuId='" + menuId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", season='" + season + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
