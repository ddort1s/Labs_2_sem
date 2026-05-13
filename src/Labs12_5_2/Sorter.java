package Labs12_5_2;

import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        Stack mainStack = new Stack();
        Stack helpStack = new Stack();
        Scanner scanner = new Scanner(System.in);

        System.out.println();
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

        System.out.println(helpStack.toString().replaceAll("[\\[\\],]", ""));
    }
}

