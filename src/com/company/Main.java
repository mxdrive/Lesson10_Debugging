package com.company;

public class Main {

    public static void main(String[] args) {
        ProductsList productsList = new ProductsList();
        productsList.showCategories();

        String productName = "Product 1";
        if(productsList.isCollectionContains(productName))
            System.out.println("Product found");
        System.out.println("\nProduct not found");
    }
}
