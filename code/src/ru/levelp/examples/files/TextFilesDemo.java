package ru.levelp.examples.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TextFilesDemo {
    public static void main(String[] args)
            throws FileNotFoundException {
        // Генерация массива случайных чисел
        int[] array = genRandomIntArray(10);
        // Сохраняем массив в файл
        save(array, "array.txt");
        // Чтение и вывод на экран
        int[] array2 = load("array.txt");
        // Печатаем массив
        System.out.println(Arrays.toString(array2));
    }

    static void save(int[] array, String fileName)
            throws FileNotFoundException {
 /*       File file = new File("C:\\MyApp\\Data", fileName);
        file.getParentFile().mkdirs();
 */
        try (PrintWriter pw = new PrintWriter(fileName)) {
            pw.println(array.length);
            for (int x : array) {
                pw.print(x + " ");
            }
            pw.println();
        }
    }

    private static int[] load(String fileName) throws FileNotFoundException {
        try (Scanner scan = new Scanner(new File(fileName))) {
            int N = scan.nextInt();
            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                result[i] = scan.nextInt();
            }
            return result;
        }
    }

    private static int[] genRandomIntArray(int N) {
        Random gen = new Random();
        int[] result = new int[N]; // Создаём массив
        // Заполняем массив
        for (int i = 0; i < result.length; i++) {
            result[i] = gen.nextInt(1000);
        }
        return result; // Возвращаем массив
    }
}
