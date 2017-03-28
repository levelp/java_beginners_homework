import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создаём генератор псевдослучайных чисел
        Random gen = new Random();
        // Создаём массив для случайных чисел
        int N = scanner.nextInt();
        int[] array = new int[N];
        // Заполняем его случайными числами
        fillArray(gen, array);
        // Печатаем исходный массив для контроля
        System.out.println(Arrays.toString(array));
        // Ищем минимум
        int min = findMin(array);
        // Выводим ответ
        System.out.println("min = " + min);
    }

    private static void fillArray(Random gen, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(100);
        }
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int x = array[i]; // Добавляемый элемент
            if (x < min)
                min = x;
        }
        return min;
    }
}
