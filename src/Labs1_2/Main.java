package Labs1_2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        String sort = scanner.nextLine();

        System.out.println();
        int age = scanner.nextInt();

        GrapeTree grapeTree = new GrapeTree(sort, age);
        System.out.println(grapeTree.getInfo());
    }
}