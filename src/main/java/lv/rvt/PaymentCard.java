package lv.rvt;

public class PaymentCard {
    private double balance;

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if (balance >= 2.6){
            balance -= 2.6;
        }
    }
    
    public void eatHeartily() {
        if (balance >= 4.6){
            balance -= 4.6;
        }
    }

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if(balance >= amount) {
            balance = balance - amount;
            return true;
            }
            return false;
        }
}