package ru.levelp.examples.basics.arrays;

import java.util.Arrays;

/**
 * Примеры синтаксиса для работы с массивами
 */
public class ArraysExample {
    public static void main(String[] args) {
        // Инициализация
        int[] a1 = new int[]{1, 2, 3, 10};
        // Сокращённая форма инициализации
        int a2[] = {1, 2, 3, 10};
        // Массив - можно сразу не инициализировать
        int[] a3;
        a3 = new int[100];
        // Пробегаем по всем элементам массива
        for (int i = 0; i < a1.length; i++) System.out.println("a1[" + i + "] = " + a1[i]);
        // Если нам не важны индексы, мы можем использовать цикл "foreach"
        for (int i : a2) System.out.print(i + " ");
        System.out.println(); // Просто перевод строки
        // == Двухмерный массив ==
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int x = array2D[0][1]; // Элемент массива с индексом 0 1
        array2D[1][1] = 231; // Новое значение


        //////////////////////////////
        // == Методы класса Arrays ==
        //////////////////////////////
        System.out.println("Arrays.toString(...) для одномерного массива:");
        System.out.println(Arrays.toString(a1));

        // Зачем нужен Arrays.deepToString(...)? Сравните вывод на экран для двухмерного массива:
        System.out.println("Arrays.toString(...) для двухмерного массива:");
        System.out.println(Arrays.toString(array2D));
        System.out.println("Arrays.deepToString(...) для двухмерного массива:");
        System.out.println(Arrays.deepToString(array2D));
    }
}

