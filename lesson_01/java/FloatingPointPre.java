package ru.levelp.examples.basics.primitives;

/**
 * Демонстрация ошибки вычислений double
 */
public class FloatingPointPre {
    public static void main(String[] args) {
        double big = 1e18;
        double small = 0.1; // .,
        double x = small + (big - big);
        System.out.println("x = " + x);
    }
}
