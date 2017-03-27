package ru.levelp.examples.solved.array;

import java.util.Arrays;

/**
 * Подсчет среднего по всем элементам массива:
 */
public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generate(20, 2, 6);

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            // Еше проще: min = Math.min(min, array[i]);
            if(min > array[i]){
                min = array[i];
            }
            // Еше проще: max = Math.max(min, array[i]);
            if(max < array[i]){
                max = array[i];
            }
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Разброс: " + (max - min));
    }
}
