package ru.levelp.examples.basics.operators;
/**
 * Демонстрация "ленивости" логических операторов
 */
public class LogicalOperationLaziness {
    public static void main(String[] args) {
        Integer i = null;

        if (i == null || i.equals(1)) {
            // Вызовется, т.к. i == null.
            System.out.println("Hello");

        }

        if (i != null && i.equals(1)) {
            // Не вызовется, т.к. i != null
            System.out.println("World");
        }

        // Вот тут выпадет ОШИБКА, т.к. i == null
        i.equals(1);
    }
}
