package ru.levelp.examples.basics.loops;

/**
 * Демонстрация работы цикла while
 */
public class WhileLoop {
    public static void main(String[] args) {
        int a = 10;
        while (a > 0) {
            System.out.println("a = " + a);
            a--;
        }

        a = 10;
        while (true) {
            System.out.println("--- a = " + a);
            a--;
            if (a == 0) {
                break;
            }
        }
    }
}
