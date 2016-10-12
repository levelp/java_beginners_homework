import java.util.Arrays;
import java.util.Random;

/**
 * Нахождение суммы оценок класса, сгенерированных случайным образом
 */
public class SumArrayExample {
    public static void main(String[] args) {
        Random r = new Random();
        // инициализируем массив случайной длины (генерируетя значение от 12 до 32 ислючая)
        int[] array = new int[r.nextInt(20) + 12];
        // пробегаем по весму массиву
        for (int i = 0; i < array.length; i++) {
            // для каждого индекса массива - генерируем случайное число от 2 до 6 (исключая) и записываем в массив
            array[i] = r.nextInt(4) + 2;
        }

        // Сумма long на случай, если будет переполнение (в общем случае. у нас это нереально с нашими значениями)
        long sum = 0;
        // Пробегаем по всем элементам в массиве
        for (int element : array) {
            // Каждый элемент добавляем к уже накопленной сумме
            sum += element;
        }
        // Выводим результат (не забываем вывести сам массив!)
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма: " + sum);
    }
}
