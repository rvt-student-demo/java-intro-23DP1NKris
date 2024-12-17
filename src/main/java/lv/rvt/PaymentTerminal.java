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
    
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}