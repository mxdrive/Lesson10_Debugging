package com.company;

import java.util.ArrayList;
import java.util.Random;

class ProductsList {
    private ArrayList<Product> products = new ArrayList<>();

    ProductsList(){
        initProductsList(5);
    }

    private void initProductsList(int productsCount){
        Random random = new Random();
        for(int i = 0; i < productsCount;) {
            Product product = new Product("Product " + ++i, (random.nextDouble()*1000+1), "Category_" + ++i);
            products.add(product);
        }
    }

    void showCategories(){
        for(Product product : products){
            product.showProduct();
        }
    }

    boolean isCollectionContains(String productName){
        boolean result = false;
        for(Product product : products){
            if(product.getName().equals(productName)) {
                result = true;
            }
        }
        return result;
    }
}
