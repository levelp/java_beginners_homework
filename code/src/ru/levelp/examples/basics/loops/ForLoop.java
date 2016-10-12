package ru.levelp.examples.basics.loops;

/**
 * Демонстрация работы цикла for
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("---");

        for (int i = 1; i < 10; i *= 2) {
            System.out.println(i);
        }

        System.out.println("---");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("---");

        for (int i = 10; i > 0; ) {
            System.out.println("! " + i);
            i--;
        }

        System.out.println("---");


        int a = 10;
        for (; ; ) {
            System.out.println("a = " + a);
            a--;
            if (a == 0) {
                break;
            }
        }
    }
}
