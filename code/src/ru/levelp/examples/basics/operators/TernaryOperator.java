package ru.levelp.examples.basics.operators;

/**
 * Демонстрация работы тернарного оператора
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int y = 10;

        String message = y > 10 ? "OK" : "Too small!";
        System.out.println("message = " + message);
    }
}
