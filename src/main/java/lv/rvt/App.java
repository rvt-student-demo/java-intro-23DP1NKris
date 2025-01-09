package lv.rvt;

public class App {
        public static void main(String[] args) {
            Box box1 = new Box(2.0, 3.0, 4.0);
            Box box2 = new Box(5.0, 6.0, 7.0);
    
            boolean result = box1.nests(box2);
            System.out.println("fits:" + result);
    

    }
}