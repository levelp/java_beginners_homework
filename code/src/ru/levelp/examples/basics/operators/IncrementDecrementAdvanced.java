package ru.levelp.examples.basics.operators;
/**
 * Демонстрация работы инкремента и декремента (задачки с собеседований)
 */
public class IncrementDecrementAdvanced {
    public static void main(String[] args) {
        int i = 1;

        System.out.println(i++ + ++i);
        System.out.println(i++ + --i);
        System.out.println(i++ + --i + ++i + i--);
        System.out.println(i);
    }
}
