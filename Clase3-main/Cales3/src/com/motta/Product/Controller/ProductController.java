package com.motta.Product.Controller;
import com.motta.Product.Model.Entities.Product;
import com.motta.Product.Model.Repositories.ProductRepository;
import com.motta.Product.View.ProductView;

public class ProductController {
    private ProductView productView;
    private ProductRepository productRepository;

    public ProductController(ProductView productView, ProductRepository productRepository) {
        this.productView = productView;
        this.productRepository = productRepository;
    }

    public void createProduct(){

        //crear producto
        Product product = this.productView.createProduct();
        //guardar el producto
        this.productRepository.addtoProductList(product);
        //mostar el producto
        this.productView.viewProduct(product);
    }
}
