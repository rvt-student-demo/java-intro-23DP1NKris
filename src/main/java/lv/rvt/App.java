package lv.rvt;
import java.util.*;

public class App {
    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<>();
        String nameInput = "";

        while (true) {
            nameInput = scanner.nextLine();
            if (nameInput.equals("")) {
                break;
            }

            names.add(nameInput);
        }
        System.out.println(names.get(2));
        scanner.close();
    }
}