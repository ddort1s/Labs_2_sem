package Labs13_z1_var4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashSetManager {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.print("> ");

            try {

                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println();
                    continue;
                }

                String[] parts = input.split("\\s+");

                String command = parts[0].toLowerCase();

                if (command.equals("stop")) {

                    running = false;
                }

                else if (command.equals("print")) {

                    printSet(hashSet);
                }

                else if (command.equals("push")) {

                    if (parts.length >= 2) {
                        processPush(hashSet, parts[1]);
                    }
                }

                else if (command.equals("pop")) {

                    if (parts.length >= 2) {
                        processPop(hashSet, parts[1]);
                    }
                }

                else if (command.equals("search")) {

                    if (parts.length >= 2) {
                        processSearch(hashSet, parts[1]);
                    }
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    private static void processPush(HashSet<Integer> hashSet, String numberStr) {

        try {

            Integer number = Integer.parseInt(numberStr);

            if (hashSet.contains(number)) {

                System.out.println("duplicate");

            } else {

                hashSet.add(number);
                printState(hashSet);
            }

        } catch (NumberFormatException e) {

            System.out.println(numberStr);
        }
    }

    private static void processPop(HashSet<Integer> hashSet, String numberStr) {

        try {

            Integer number = Integer.parseInt(numberStr);

            if (hashSet.remove(number)) {
                printState(hashSet);
            } else {
                printState(hashSet);
            }
        } catch (NumberFormatException e) {
            System.out.println(numberStr);
        }
    }

    private static void processSearch(HashSet<Integer> hashSet, String numberStr) {

        try {

            Integer number = Integer.parseInt(numberStr);

            if (hashSet.contains(number)) {

                System.out.println("yes");

            } else {
                System.out.println("no");
            }

        } catch (NumberFormatException e) {
            System.out.println(numberStr);
        }
    }

    private static void printSet(HashSet<Integer> hashSet) {

        if (hashSet.isEmpty()) {
            System.out.println();
            return;
        }

        List<Integer> sorted = new ArrayList<>(hashSet);

        Collections.sort(sorted);

        for (Integer number : sorted) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    private static void printState(HashSet<Integer> hashSet) {

        List<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);

        if (list.isEmpty()) {
            System.out.println("-");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

            if (i != list.size() - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}