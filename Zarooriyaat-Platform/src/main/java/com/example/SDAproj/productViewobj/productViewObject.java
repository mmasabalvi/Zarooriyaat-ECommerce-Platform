package com.example.SDAproj.productViewobj;

public class productViewObject {
    
    private String name;
    private String imageUrl;
    private String stockStatus;
    private String categoryPath;
    private double sellingPrice;
    private double originalPrice;
    private String description;

    // Constructors
    public productViewObject() {}

    public productViewObject(String name, String imageUrl, String stockStatus, String categoryPath, double sellingPrice, double originalPrice, String description) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.stockStatus = stockStatus;
        this.categoryPath = categoryPath;
        this.sellingPrice = sellingPrice;
        this.originalPrice = originalPrice;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
