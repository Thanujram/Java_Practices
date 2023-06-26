package DesignPatterns.BuilderDPTest;

import DesignPatterns.BuilderDP.Product;
import DesignPatterns.BuilderDP.ProductBuilder;

public class Client {
    public static void main(String []Args){

//        Product p = new Product(100,"Name"); WONT WORK HERE

        Product product = new ProductBuilder().setProductId(100).setProductName("Pixel").Build();

        System.out.println(product.getProductId());
        System.out.println(product.getProductName());
    }
}
