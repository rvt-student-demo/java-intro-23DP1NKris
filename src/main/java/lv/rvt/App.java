package lv.rvt;
import java.util.*;

public class App {
    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int numberInput;

        while (true) {
            numberInput = scanner.nextInt();
            if (numberInput == 0) {
                break;
            }

            numbers.add(numberInput);
        }
        
        System.out.println(numbers.get(1) + numbers.get(2));

        scanner.close();
    }
}