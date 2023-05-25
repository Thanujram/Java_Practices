package DesignPatterns.FactoryDP;

public class Test {
    public static void main(String []args){

        Product p1 = ProductFactory.createProduct("A");
        p1.productMethod();

        Product p2 = ProductFactory.createProduct("B");
        p2.productMethod();
    }
}
