package lv.rvt;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("");

        printSquare(4);
        System.out.println("");

        printRectangle(17, 3);
        System.out.println("");

        printTriangle(4);
        System.out.println("");

        printTriangleTwo(4);
        System.out.println("");

        christmasTree(10);

        scanner.close();
    }

    public static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int squareSize) {
        for (int i = 0; i < squareSize; i++) {
            for (int x = 0; x < squareSize; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int rectWidth, int rectHeight) {
        for (int i = 0; i < rectHeight; i++) {
            for (int x = 0; x < rectWidth; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int triangleSize) {
        for (int i = 0; i < triangleSize; i++) {
            for (int x = 0; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printSpaces(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangleTwo(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int treeHeight) {
        for (int i = 1; i <= treeHeight; i++) {
            printSpaces(treeHeight - i);
            printStars(2 * i - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(treeHeight - 2);
            System.out.println("***");
        }
    }
}