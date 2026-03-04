package Labs1_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Triangle triangle = new Triangle(a, b, c);

        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimetr = " + triangle.getPerimetr());
        System.out.println("Triangles is equal");
    }
}