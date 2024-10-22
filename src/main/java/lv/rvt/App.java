package lv.rvt;
import java.util.*;

public class App {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int numberInput;

        while (true) {
            numberInput = scanner.nextInt();
            if (numberInput == -1) {
                break;
            }
            numbers.add(numberInput);
        }

        while (true) {
            System.out.println("From where?");
            Integer start = scanner.nextInt();
            System.out.println("To where?");
            Integer end = scanner.nextInt();
            if (start < 0 || end > numbers.size() || start >= end) {
                System.out.println("Invalid input, input the values again");
            } else {
                for (int i = start; i < end; i++) {
                    System.out.println(numbers.get(i));
                }
                break;
            }
        }

        scanner.close();
    }
}
