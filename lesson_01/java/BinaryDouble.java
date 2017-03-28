package ru.levelp.examples.basics.primitives;

/**
 * Демонстрация бинарного представления числа double
 */
public class BinaryDouble {
    public static void main(String[] args) {
        System.out.println("HEXADECIMAL:");
        System.out.println("----");
        System.out.println();
        System.out.println("Double.toHexString(0.0) = " + Double.toHexString(0.0));
        System.out.println("Double.toHexString(-0.0) = " + Double.toHexString(-0.0));
        System.out.println("Double.toHexString(1.0) = " + Double.toHexString(1.0));
        System.out.println("Double.toHexString(-1.0) = " + Double.toHexString(-1.0));
        System.out.println("Double.toHexString(100.0) = " + Double.toHexString(100.0));
        System.out.println("Double.toHexString(-100.0) = " + Double.toHexString(-100.0));
        System.out.println("Double.toHexString(Double.NaN) = " + Double.toHexString(Double.NaN));
        System.out.println("Double.toHexString(Double.NEGATIVE_INFINITY) = " + Double.toHexString(Double.NEGATIVE_INFINITY));
        System.out.println("Double.toHexString(Double.POSITIVE_INFINITY) = " + Double.toHexString(Double.POSITIVE_INFINITY));
        System.out.println("Double.toHexString(Double.MIN_VALUE) = " + Double.toHexString(Double.MIN_VALUE));
        System.out.println("Double.toHexString(Double.MAX_VALUE) = " + Double.toHexString(Double.MAX_VALUE));


        System.out.println();
        System.out.println("BINARY:");
        System.out.println("----");
        System.out.println();
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(0.0)) = " + Long.toBinaryString(Double.doubleToRawLongBits(0.0)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(-0.0)) = " + Long.toBinaryString(Double.doubleToRawLongBits(-0.0)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(1.0)) = " + Long.toBinaryString(Double.doubleToRawLongBits(1.0)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(-1.0)) = " + Long.toBinaryString(Double.doubleToRawLongBits(-1.0)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(100.0)) = " + Long.toBinaryString(Double.doubleToRawLongBits(100.0)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(-100.0)) = " + Long.toBinaryString(Double.doubleToRawLongBits(-100.0)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(Double.NaN)) = " + Long.toBinaryString(Double.doubleToRawLongBits(Double.NaN)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY)) = " + Long.toBinaryString(Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(Double.POSITIVE_INFINITY)) = " + Long.toBinaryString(Double.doubleToRawLongBits(Double.POSITIVE_INFINITY)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(Double.MIN_VALUE)) = " + Long.toBinaryString(Double.doubleToRawLongBits(Double.MIN_VALUE)));
        System.out.println("Long.toBinaryString(Double.doubleToRawLongBits(Double.MAX_VALUE)) = " + Long.toBinaryString(Double.doubleToRawLongBits(Double.MAX_VALUE)));


    }
}
