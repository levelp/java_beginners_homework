package ru.levelp.examples.solved.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by asolodkaya on 27.03.17.
 */
public class ArrayDistribution {

    public static final int FROM = 0;
    public static final int TO = 10;
    public static final int ARRAY_SIZE = 20;

    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generate(ARRAY_SIZE, FROM, TO);


        int[] distribution = new int[TO - FROM];
        for (int i = 0; i < array.length; i++) {
            distribution[array[i] - FROM]++;
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("\nРаспределение:");
        for (int i = 0; i < distribution.length; i++) {
            System.out.printf("Число %d: %d раз%n", i + FROM, distribution[i]);
        }
    }
}
