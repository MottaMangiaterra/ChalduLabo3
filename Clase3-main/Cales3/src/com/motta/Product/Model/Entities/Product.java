package com.motta.Product.Model.Entities;

public class Product {
    private Integer id;
    private String nameProduct;

    public Product(Integer id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}
