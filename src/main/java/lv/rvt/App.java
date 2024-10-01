package lv.rvt;

import java.util.Scanner;

public class App
    {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start number:");
        int start = Integer.valueOf(scanner.nextLine());

        for(int i = start; i <=100; i++) {
        System.out.println(i);
        }

    scanner.close();

    }
}