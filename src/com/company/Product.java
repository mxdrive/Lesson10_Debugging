package com.company;

public class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category){
        this.name = name;
        this.price = Math.round(price*100)/100.0;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void showProduct(){
        System.out.printf("%-20s %-20s %-20s\n", name, category, price);
    }
}
