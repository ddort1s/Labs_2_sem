package Labs9_2_1;

public class Main {
    public static void main(String[] args) {

        // 1. Демонстрация STUDENT
        System.out.println("--- Student Test ---");
        try {
            Students student = new Students("Ivan", "Ivanov", "ABC", "2023-01-a1b2c");
            System.out.println(student.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 2. Демонстрация WORKER (Вариант 4)
        System.out.println("\n--- Worker Test ---");
        try {
            // Тест: 1000$ / (5 дней * 8 часов) = 25.00
            Worker worker = new Worker("Petr", "Petrov", 1000.0, 5, 8);
            System.out.println(worker.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 3. Демонстрация PUPILS
        System.out.println("\n--- Pupils Test ---");
        try {
            Pupils pupil = new Pupils("Mariya", "Sidorova", 5, false); // false = Девочка
            System.out.println(pupil.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 4. Демонстрация ОШИБКИ (например, неправильный класс у школьника)
        System.out.println("\n--- Error Handling Test ---");
        try {
            Pupils errorPupil = new Pupils("Alex", "Smith", 15, true); // Класс 15 — ошибка
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Выведет: Expected value mismatch! Argument: class number
        }
    }
}
