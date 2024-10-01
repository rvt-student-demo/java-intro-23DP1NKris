package lv.rvt;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        // printUntilNumber(5);
        divisibleByThreeInRange(2, 10);

        scanner.close();
    }

    public static void printUntilNumber(int num)  {
        for(int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void divisibleByThreeInRange(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}