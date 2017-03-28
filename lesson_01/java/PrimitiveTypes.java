package ru.levelp.examples.basics.primitives;

/**
 * Демонстрация всех примитивных типов
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        // целые
        char c0 = 0; // 1-байтный беззнаковый
        char c1 = 'a';
        char c2 = '\u0001';
        byte b = 10; // 1-байтный
        short s = 10; // 2-байтный
        int t = 10; // 4-байтный
        long l0 = 1000000000000000000L; // 8-байтный
        long l1 = 10;

        // с плавающей запятой
        float f0 = 10.0f; // 4-байтный
        float f1 = 10;
        double d0 = 10.0d; // 8-байтный
        double d1 = 10;

        // boolean
        boolean b0 = true;
        boolean b1 = false;

    }
}
