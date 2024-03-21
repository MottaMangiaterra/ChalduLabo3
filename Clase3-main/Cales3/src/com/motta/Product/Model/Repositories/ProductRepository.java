package com.motta.Product.Model.Repositories;

import com.motta.Product.Model.Entities.Product;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> ListProducts;

    public ProductRepository() {
        ListProducts = new ArrayList<>();
    }

    public void addtoProductList(Product product) {
        this.ListProducts.add(product);
    }

    public void udpdateProductList(Product producttochange, String newName) {

    }
}
