package Labs12_5_1_5;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        testStackPerformance();
    }

    public static void testStackPerformance() {
        Stack stack = new Stack();

        stack.push(13);
        stack.push(222);
        System.out.println("Текущий стек: " + stack.toString());
    }

    public static class Sorter {
        public static void main(String[] args) {
            Labs12_5_2.Stack mainStack = new Labs12_5_2.Stack();
            Labs12_5_2.Stack helpStack = new Labs12_5_2.Stack();
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            for (String num : input.split("\\s+")) {
                mainStack.push(Integer.parseInt(num));
            }

            try {
                while (true) {
                    Integer current = mainStack.pop();

                    while (true) {
                        try {
                            Integer topHelp = helpStack.pop();
                            if (topHelp > current) {
                                mainStack.push(topHelp);
                            } else {
                                helpStack.push(topHelp);
                                break;
                            }
                        } catch (IllegalArgumentException e) {
                            break;
                        }
                    }
                    helpStack.push(current);
                }
            } catch (IllegalArgumentException e) {
            }

            System.out.println("Вывод: " + helpStack.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
