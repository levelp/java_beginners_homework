package ru.levelp.examples.solved.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by asolodkaya on 27.03.17.
 */
public class ArrayIndex {
    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generate(20, 2, 6);
        Random random = new Random();
        int toFind = random.nextInt(10);


        int first = -1;
        int last = -1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == toFind){
                if(first < 0){
                    first = i;
                }
                last = i;
                count++;
            }
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Число: " + toFind);
        if(first >= 0) {
            System.out.println("Первое вхождение: " + first);
            System.out.println("Последнее вхождение: " + last);
            System.out.println("Всего вхождений: " + count);
        } else {
            System.out.println("Вхождений нет");
        }
    }
}
