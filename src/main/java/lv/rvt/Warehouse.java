package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.balance = 0;

        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            if (balance + amount > capacity) {
                balance = capacity;
            } else {
                balance += amount;
            }
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount <= 0) {
            return 0;
        }

        double takenAmount;
        if (amount > balance) {
            takenAmount = balance;
            balance = 0;
        } else {
            takenAmount = amount;
            balance -= amount;
        }
        return takenAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }
}