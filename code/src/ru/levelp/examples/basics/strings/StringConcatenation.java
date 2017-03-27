package ru.levelp.examples.basics.strings;

/**
 * Демонстрация правил конкатенации строк через оператор "+"
 */
public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println("result : " + (2.0 / 3));
        System.out.println("result : " + 2.0 / 3);
        // не скомпилируется!
        // System.out.println(" result : " + 2 << 1);
        System.out.println("result : " + 2 + 3);
        System.out.println(2 + 3 + " - result ");

        // не скомпилируется!
//        System.out.println("result : " + 2 - 3);
        System.out.println(2 - 3 + " - result ");
    }
}
