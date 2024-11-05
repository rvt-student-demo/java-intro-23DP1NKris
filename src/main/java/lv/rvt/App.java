package lv.rvt;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        bond.printAgent();

        Agent batman = new Agent("Bat", "Man");
        batman.printAgent();
    }
}