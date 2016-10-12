package ru.levelp.examples.basics.primitives;

/**
 * Демонстрация приведения типов и buffer overflow.
 */
public class TypesCasting {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////
        // Что, если мы засунем слишком большое число в int?
        ////////////////////////////////////////////////////
        long l = 10000000000000000L;
        // число урезалось!
        int p = (int) l;
        System.out.println("p = " + p + ", l = " + l);


        ////////////////////////////////////////////////////
        // buffer overflow для двух перемноженных int
        ////////////////////////////////////////////////////
        int a = 2000000000;
        int b = 2000000000;
        int resultInt = a * b;
        // Операция a * b всегда дает int, потому приведем сначала число a к long (long * int = long)
        long resultLong = ((long) a) * b;
        System.out.println("Результат: " + resultInt + ", а на самом деле должно получиться " + resultLong);
    }
}
