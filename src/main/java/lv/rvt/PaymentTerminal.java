package lv.rvt;

public class PaymentTerminal {
    private double money;
    private int affordableMeals; 
    private int heartyMeals; 
        
    public PaymentTerminal() {
        this.money = 1000;
    }
    
    public double eatAffordably(double payment) {
    double price = 2.50;
    
        if (payment >= price) {
            money += price;
            affordableMeals++;
            return payment - price;
        }
        return payment;
    }
    
    public double eatHeartily(double payment) {
        double price = 4.30;
        
        if (payment >= price) {
            money += price;
            heartyMeals++;
            return payment - price;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double price = 2.50;
        if (card.balance() >= price) {
            card.takeMoney(price);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double price = 4.30;
        
        if (card.balance() >= price) {
            card.takeMoney(price);
            heartyMeals++;
            return true;
        }
        return false;
    }
    
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}