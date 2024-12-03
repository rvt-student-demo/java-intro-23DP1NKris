package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your weight");
        int weight = scanner.nextInt();
        System.out.println("Enter your height");
        int height = scanner.nextInt();

        Person person = new Person(name, age, height, weight);
        PersonManager.addPerson(person);
        System.out.println("Thanks for registering!");

        scanner.close();
    }

    public static void modify(Person person) {
        person.setName("Modified!");
    }
}