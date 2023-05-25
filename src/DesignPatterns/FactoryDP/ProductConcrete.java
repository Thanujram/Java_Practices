package DesignPatterns.FactoryDP;

public class ProductConcrete implements Product{

    public void productMethod(){

        System.out.println("Working from concrete class");
    }
}

class ProductConcrete2 implements Product{

    public void productMethod(){

        System.out.println("Working from concrete class 2nd instance");
    }
}
