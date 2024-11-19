package lv.rvt;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
   }
}