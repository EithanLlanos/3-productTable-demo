package com.example.producttable.entities;

public class Product {
    static private int cnt = 0;
    private String id;
    private String name;
    private String desc;
    private int stock;
    private double price;

    public Product(String id, String name, String desc, int stock, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.stock = stock;
        this.price = price;
        cnt++;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Product.cnt = cnt;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}