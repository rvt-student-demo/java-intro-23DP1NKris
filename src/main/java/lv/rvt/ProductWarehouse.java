package lv.rvt;

public class ProductWarehouse extends Warehousing {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product: " + productName + ", " + super.toString();
    }
}