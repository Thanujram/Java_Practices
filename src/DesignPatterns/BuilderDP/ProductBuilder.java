package DesignPatterns.BuilderDP;

public class ProductBuilder {

    private long productId;
    private String productName;

//    public ProductBuilder setProductId


    public long getProductId() {
        return productId;
    }

    public ProductBuilder setProductId(long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public ProductBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public Product Build(){
        return new Product(productId, productName);
    }
}
