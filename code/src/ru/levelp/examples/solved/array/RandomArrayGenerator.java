package ru.levelp.examples.solved.array;

import java.util.Random;

/**
 * Методы для генерации случайных данных в массиве
 */
public class RandomArrayGenerator {

    /**
     * Генерирует массив длины size со значениями от 0 до 100 (исключая)
     */
    public static int[] generate(int size) {
        return generate(size, 0, 100);
    }

    /**
     * Генерирует массив длины size со значениями от from до to (исключая)
     */
    public static int[] generate(int size, int from, int to){
        int bound = to - from;
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + from;
        }
        return array;
    }
}
