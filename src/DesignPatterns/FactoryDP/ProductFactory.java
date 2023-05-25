package DesignPatterns.FactoryDP;

public class ProductFactory {

    public static Product createProduct(String val){

        if(val.equals("A")){
            return new ProductConcrete();
        }
        else if (val.equals("B")){
            return new ProductConcrete2();
        }
        return null;
    }
}
