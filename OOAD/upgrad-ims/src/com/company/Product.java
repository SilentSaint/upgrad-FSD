package com.company;

public class Product {
    int id;
    String name;
    String category;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

    float getProfitLoss(){
        return salesPrice - cost;
    }
    void activate(){
        active = true;
    }
    void deactivate(){
        active = false;
    }
    boolean isBelowThreshold(){
        return quantity < 100;
    }
}
