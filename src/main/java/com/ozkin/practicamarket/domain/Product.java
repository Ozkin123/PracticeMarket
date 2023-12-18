package com.ozkin.practicamarket.domain;

public class Product {
    private int productId;
    private System name;
    private int categopryID;
    private double price;
    private int stock;
    private boolean active;
    private Category category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public System getName() {
        return name;
    }

    public void setName(System name) {
        this.name = name;
    }

    public int getCategopryID() {
        return categopryID;
    }

    public void setCategopryID(int categopryID) {
        this.categopryID = categopryID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
