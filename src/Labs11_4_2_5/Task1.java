package Labs11_4_2_5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Task1 {

    public static void main(String[] args) throws IOException {

        String filename = "task.txt";

        List<String> lines =
                Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);

        List<String> resultLines = new ArrayList<>();

        for (String line : lines) {

            if (line.contains("=")) {

                String[] parts = line.split("=", 2);

                String expression = parts[0].trim();

                String answer;

                try {

                    double result = evaluateExpression(expression);

                    answer = String.valueOf(result);

                } catch (Exception e) {

                    answer = "invalid";
                }

                resultLines.add(expression + "=" + answer);

            } else {

                resultLines.add(line);
            }
        }

        Files.write(
                Paths.get(filename),
                resultLines,
                StandardCharsets.UTF_8
        );

        System.out.println("Файл обновлен успешно!");

        for (String line : resultLines) {
            System.out.println(line);
        }
    }

    private static double evaluateExpression(String expr) throws Exception {

        expr = expr.replaceAll("\\s+", "");

        if (expr.contains("+") || expr.contains("*") || expr.contains("/")) {
            throw new Exception("Invalid operation");
        }

        return evaluatePowerChain(expr);
    }

    private static double evaluatePowerChain(String expr) throws Exception {

        String[] parts = expr.split("\\^");

        if (parts.length < 2) {
            throw new Exception("Invalid expression");
        }

        double result = parseValue(parts[0]);

        for (int i = 1; i < parts.length; i++) {

            double exponent = parseValue(parts[i]);

            result = Math.pow(result, exponent);
        }

        return result;
    }

    private static double parseValue(String str) throws Exception {

        str = str.trim();

        if (str.startsWith("(") && str.endsWith(")")) {

            str = str.substring(1, str.length() - 1);
        }

        return Integer.parseInt(str);
    }
}