package ru.levelp.examples.scanner;

import java.util.Random;
import java.util.Scanner;

/**
 * Игра на угадывание числа. Пример ввода пользователя через сканнер.
 */
public class SimpleScannerGame {

    public static final int BOUND = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int myNumber = random.nextInt(BOUND);
        System.out.println("Я загадал число от 0 до " + (BOUND - 1) + "! Попробуй угадать его!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введи целое число: ");
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();
                if (userNumber == myNumber) {
                    System.out.println("Поздравляю! Ты угадал!");
                    System.exit(0);
                } else if (userNumber < myNumber) {
                    System.out.println("Это не оно! Мое число больше! Поробуй еще раз!");
                } else {
                    System.out.println("Это не оно! Мое число меньше! Поробуй еще раз!");
                }

            } else {
                System.out.println("Это либо не число, либо оно слишком большое. Попробуй целые числа от "
                        + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE + ".");
                scanner.nextLine();
            }
        }
    }
}
