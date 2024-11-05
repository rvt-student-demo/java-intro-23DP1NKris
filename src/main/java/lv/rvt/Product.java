package lv.rvt;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;

    Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    void printProduct() {
        System.out.println(productName + ", price " + productPrice + ", " + productQuantity + " pcs");
    }
}
