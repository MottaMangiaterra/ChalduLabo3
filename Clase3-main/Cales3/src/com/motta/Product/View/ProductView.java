package com.motta.Product.View;

import com.motta.Product.Model.Entities.Product;

import java.util.Scanner;

public class ProductView {
    public void viewProduct(Product product){
        System.out.println("Product Name: "+product.getNameProduct());
        System.out.println("Product ID: "+product.getId());
    }

    public Product createProduct (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the ID: ");
        Integer ID = scanner.nextInt();
        scanner.nextLine();//Metodo para cuando tenes un scan de entero arriba de un string

        System.out.println("Set the product name: ");
        String nameProduct = scanner.nextLine();

        return new Product(ID,nameProduct);
    }
}
