package lv.rvt;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader reader = Utils.getReader("data.csv");

        scanner.close();

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
