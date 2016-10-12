package ru.levelp.examples.solved.array;

import java.util.Arrays;

/**
 * Подсчет суммы элементов массива:
 */
public class ArraySumAvg {
    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generate(20, 2, 6);

        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + (double)sum / array.length);
    }
}
