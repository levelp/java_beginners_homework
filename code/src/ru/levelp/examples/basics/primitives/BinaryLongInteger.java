package ru.levelp.examples.basics.primitives;

/**
 * Демонстрация бинарного представления чисел long и int
 */
public class BinaryLongInteger {
    public static void main(String[] args) {
        System.out.println("---  INTEGER  ---");
        int i = 100;
        System.out.println("i = " + i);
        // бинарное представление
        System.out.println("Integer.toBinaryString(i) = " + Integer.toBinaryString(i));
        // двоичная система
        System.out.println("Integer.toString(i, 2) = " + Integer.toString(i, 2));
        // hex-представление
        System.out.println("Integer.toHexString(i) = " + Integer.toHexString(i));
        // 16-ричная система
        System.out.println("Integer.toString(i, 16) = " + Integer.toString(i, 16));
        // octal-представление
        System.out.println("Integer.toOctalString(i) = " + Integer.toOctalString(i));
        // 8-ричная система
        System.out.println("Integer.toString(i, 8) = " + Integer.toString(i, 8));
        // 7-ричная система
        System.out.println("Integer.toString(i, 7) = " + Integer.toString(i, 7));
        // 3-ичная система
        System.out.println("Integer.toString(i, 3) = " + Integer.toString(i, 3));
        // 21-ичная система
        System.out.println("Integer.toString(i, 21) = " + Integer.toString(i, 21));
        System.out.println("   ------   ");
        i = -100;
        System.out.println("i = " + i);
        // бинарное представление
        System.out.println("Integer.toBinaryString(i) = " + Integer.toBinaryString(i));
        // двоичная система
        System.out.println("Integer.toString(i, 2) = " + Integer.toString(i, 2));
        // hex-представление
        System.out.println("Integer.toHexString(i) = " + Integer.toHexString(i));
        // 16-ричная система
        System.out.println("Integer.toString(i, 16) = " + Integer.toString(i, 16));
        // octal-представление
        System.out.println("Integer.toOctalString(i) = " + Integer.toOctalString(i));
        // 8-ричная система
        System.out.println("Integer.toString(i, 8) = " + Integer.toString(i, 8));
        // 7-ричная система
        System.out.println("Integer.toString(i, 7) = " + Integer.toString(i, 7));
        // 3-ичная система
        System.out.println("Integer.toString(i, 3) = " + Integer.toString(i, 3));
        // 21-ичная система
        System.out.println("Integer.toString(i, 21) = " + Integer.toString(i, 21));
        System.out.println();
        System.out.println();
        System.out.println("---  LONG  ---");
        long l = 1000000000000000000L;
        System.out.println("l = " + l);
        // бинарное представление
        System.out.println("Long.toBinaryString(l) = " + Long.toBinaryString(l));
        // двоичная система
        System.out.println("Long.toString(l, 2) = " + Long.toString(l, 2));
        // hex-представление
        System.out.println("Long.toHexString(l) = " + Long.toHexString(l));
        // 16-ричная система
        System.out.println("Long.toString(l, 16) = " + Long.toString(l, 16));
        // octal-представление
        System.out.println("Long.toOctalString(l) = " + Long.toOctalString(l));
        // 8-ричная система
        System.out.println("Long.toString(l, 8) = " + Long.toString(l, 8));
        // 7-ричная система
        System.out.println("Long.toString(l, 7) = " + Long.toString(l, 7));
        // 3-ичная система
        System.out.println("Long.toString(l, 3) = " + Long.toString(l, 3));
        // 21-ичная система
        System.out.println("Long.toString(l, 21) = " + Long.toString(l, 21));
        System.out.println("   ------   ");
        l = -1000000000000000000L;
        System.out.println("l = " + l);
        // бинарное представление
        System.out.println("Long.toBinaryString(l) = " + Long.toBinaryString(l));
        // двоичная система
        System.out.println("Long.toString(l, 2) = " + Long.toString(l, 2));
        // hex-представление
        System.out.println("Long.toHexString(l) = " + Long.toHexString(l));
        // 16-ричная система
        System.out.println("Long.toString(l, 16) = " + Long.toString(l, 16));
        // octal-представление
        System.out.println("Long.toOctalString(l) = " + Long.toOctalString(l));
        // 8-ричная система
        System.out.println("Long.toString(l, 8) = " + Long.toString(l, 8));
        // 7-ричная система
        System.out.println("Long.toString(l, 7) = " + Long.toString(l, 7));
        // 3-ичная система
        System.out.println("Long.toString(l, 3) = " + Long.toString(l, 3));
        // 21-ичная система
        System.out.println("Long.toString(l, 21) = " + Long.toString(l, 21));
    }
}
