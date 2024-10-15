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
        
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println(sum);

        scanner.close();
    }
}