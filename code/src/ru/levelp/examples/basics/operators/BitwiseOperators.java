package ru.levelp.examples.basics.operators;
/**
 * Демонстрация работы битовых операций
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        int n = -123;
        int m = 25;

        System.out.printf("n           = %32s%n", Integer.toBinaryString(n));
        System.out.printf("m           = %32s%n", Integer.toBinaryString(m));
        System.out.printf("n & m       = %32s%n", Integer.toBinaryString(n & m));
        System.out.println();
        System.out.printf("n           = %32s%n", Integer.toBinaryString(n));
        System.out.printf("m           = %32s%n", Integer.toBinaryString(m));
        System.out.printf("n | m       = %32s%n", Integer.toBinaryString(n | m));
        System.out.println();
        System.out.printf("n           = %32s%n", Integer.toBinaryString(n));
        System.out.printf("m           = %32s%n", Integer.toBinaryString(m));
        System.out.printf("n ^ m       = %32s%n", Integer.toBinaryString(n ^ m));
        System.out.println();
        System.out.printf("n           = %32s%n", Integer.toBinaryString(n));
        System.out.printf("~n          = %32s%n", Integer.toBinaryString(~n));
        System.out.printf("m           = %32s%n", Integer.toBinaryString(m));
        System.out.printf("~m          = %32s%n", Integer.toBinaryString(~m));
    }

}
