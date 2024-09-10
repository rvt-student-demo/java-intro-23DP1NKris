package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)  {
        // void - neko neatgriež

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of your product: ");
        String product = scanner.nextLine();

        System.out.println("Write the amount of stock: ");
        int amount = Integer.valueOf(scanner.nextLine());   

        System.out.println("Is the for sale? (true/false): ");
        boolean avaliable = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("The " + product + " has " + amount + " items in stock. The product is currently avaliable for sale: " + avaliable + ".");

        scanner.close();
    }
}