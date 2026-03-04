package Labs1_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String name = scanner.next();
            int age = scanner.nextInt();

            Grapes grapes = new Grapes(name, age);

            System.out.println(grapes);

        } catch (IllegalArgumentException e) {
            System.out.println("Error in field: " + e.getMessage());
        }
    }
}