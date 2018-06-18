package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ProductsList {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductsList(){
        initProductsList(5);
    }

    public void initProductsList(int productsCount){
        Random random = new Random();
        for(int i = 0; i < productsCount;) {
            Product product = new Product("Product " + ++i, (random.nextDouble()*1000+1), "Category_" + ++i);
            products.add(product);
        }
    }

    public void showCategories(){
        for(Product product : products){
            product.showProduct();
        }
    }

    public boolean isCollectionContains(String productName){
        for(Product product : products){
            if(product.equals(productName)) {
                return true;
            }
            else
                continue;
        }
        return false;
    }
}
