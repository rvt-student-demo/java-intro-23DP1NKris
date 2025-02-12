package lv.rvt;

import java.lang.reflect.Array;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount);
        return takenAmount;
    }

    public String history() {
        return history.toString();
    }

}
