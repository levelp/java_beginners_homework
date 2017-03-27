package ru.levelp.examples.lambda;

import java.util.Arrays;
import java.util.Random;

/**
 * Демонстрация работы с лямбда выражениями. Два типа синтаксиса:
 * -- () -> ...
 * -- Class::methodName
 * -- this::methodName - так тоже можно для нестатических методов
 */
public class LambdaDemo {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[random.nextInt(10 ) + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("add: " + process(array, 0, (a1, a2) -> a1 + a2));
        System.out.println("add: " + process(array, 0, LambdaDemo::add));
        System.out.println("----");
        System.out.println("mult: " + process(array, 1, (a1, a2) -> a1 = a1 * a2));
        System.out.println("----");
        System.out.println("max: " + process(array, Integer.MIN_VALUE, (a1, a2) -> a1 > a2 ? a1 : a2));
        System.out.println("max: " + process(array, Integer.MIN_VALUE, Math::max));
        System.out.println("----");
        System.out.println("min: " + process(array, Integer.MAX_VALUE, (a1, a2) -> a1 < a2 ? a1 : a2));
        System.out.println("min: " + process(array, Integer.MAX_VALUE, Math::min));

    }

    private static long add(long a1, int a2){
        return a1 + a2;
    }

    public static long process(int[] array, int accumulator, BinaryOperation operation){
        long result = accumulator;
        for (int el : array) {
            result = operation.apply(result, el);
        }
        return result;
    }
}
