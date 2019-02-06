package com.restaurant.entity;

public class SortedMenu {
    private String id;
    private String menuId;
    private String name;
    private String type;
    private String price;
    private String season;

    public SortedMenu(String menuId, String name, String type, String price, String season) {
        this.menuId = menuId;
        this.name = name;
        this.type = type;
        this.price = price;
        this.season = season;
    }

    public SortedMenu(String id, String menuId, String name, String type, String price, String season) {

        this.id = id;
        this.menuId = menuId;
        this.name = name;
        this.type = type;
        this.price = price;
        this.season = season;
    }

    @Override
    public String toString() {
        return "SortedMenu{" +
                "id='" + id + '\'' +
                ", menuId='" + menuId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", season='" + season + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
