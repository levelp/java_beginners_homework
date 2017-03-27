package ru.levelp.examples.basics.arrays;

import java.util.Random;

/**
 * Создание массива случайных чисел
 */
public class RandomArrayExample {
    public static void main(String[] args) {
        Random r = new Random();
        // инициализируем массив длинной 10
        int[] array = new int[10];
        // пробегаем по весму массиву
        for (int i = 0; i < array.length; i++) {
            // для каждого индекса массива - генерируем случайное число от 0 до 100 (исключая) и записываем в массив
            array[i] = r.nextInt(100);
        }
    }
}
