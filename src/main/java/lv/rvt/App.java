package lv.rvt;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics allStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

        
        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            allStatistics.addNumber(number);

            if (number % 2 == 0) {
                evenStatistics.addNumber(number);
            } else {
                oddStatistics.addNumber(number);
            }
        }

        scanner.close();

        System.out.println("Count: " + allStatistics.getCount());
        System.out.println("Sum: " + allStatistics.sum());
        System.out.println("Average: " + allStatistics.average());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}
