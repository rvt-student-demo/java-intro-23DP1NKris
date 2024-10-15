package lv.rvt;
import java.util.*;

public class App {
    
    public static void main(String[] args)  {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Tom", "Emma", "Alex", "Mary"));
        System.out.println(names.get(2));

        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Emma", "Alex", "Mary"));
        System.out.println(names2.get(2));
        
    }
}