package ru.levelp.examples.scanner;

import java.util.Scanner;

/**
 * Простейший пример работы со сканнером
 */
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in - стандартный ввод пользователя
        System.out.print("Привет, User! Скажи свое имя!  ");
        String name = scanner.nextLine(); // Считаем строку
        System.out.print("А сколько тебе лет?  ");
        int age = scanner.nextInt(); // Считаем целое число
        System.out.print("Введи свое любимое float число в лоакльном формате!  ");
        float num = scanner.nextFloat(); // Считаем число с плавающей запятой
        System.out.println("\n\n\n");
        System.out.println("Введенные данные:"); // Выводим данные:
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("num = " + num);
    }
}
