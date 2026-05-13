package Labs11_4_1_5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "example.txt";

        try {
            String text = Files.readString(Paths.get(path));

            int count = 0;

            for (char c : text.toCharArray()) {
                if (isPunctuation(c)) {
                    count++;
                }
            }

            System.out.println("Знаков препинания: " + count);

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    private static boolean isPunctuation(char c) {
        return c == '.' ||
                c == ',' ||
                c == '!' ||
                c == '?' ||
                c == ';' ||
                c == ':' ||
                c == '-' ||
                c == '–' ||
                c == '(' ||
                c == ')' ||
                c == '"' ||
                c == '«' ||
                c == '»' ||
                c == '\'' ;
    }


}