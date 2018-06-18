package com.company;

class Product {
    private String name;
    private double price;
    private String category;

    Product(String name, double price, String category){
        this.name = name;
        this.price = Math.round(price*100)/100.0;
        this.category = category;
    }

    String getName() {
        return name;
    }

    void showProduct(){
        System.out.printf("%-20s %-20s %-20s\n", name, category, price);
    }
}
