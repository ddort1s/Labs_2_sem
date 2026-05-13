package Labs8_1_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();


        Triangle triangle = new Triangle(a, b, c);
        Triangle triangle1 = new Triangle(a1,b1,c1);

        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimetr = " + triangle.getPerimeter());
        if (triangle1.isEquals(triangle)) {
            System.out.println("Triangles is equal");
        } else {
            System.out.println("Triangles are NOT equal");
        }
    }
}
