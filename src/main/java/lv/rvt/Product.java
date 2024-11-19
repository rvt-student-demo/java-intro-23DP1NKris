package lv.rvt;

public class Product {
    private String name;
    private String location;
    private int weight;

    Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    Product(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg) can be found from the " + location;
    }
}
