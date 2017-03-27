package ru.levelp.examples.list;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Демонстрация методов работы c TreeSet
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println("-- Добавляем элементы");
        set.add(0);
        set.add(2);
        set.add(8);
        set.add(5);
        set.add(7);
        set.add(7);
        set.add(3);
        set.add(12);
        set.add(1);
        set.add(0);
        System.out.println(set);

        System.out.println("-- Удаляем значение 5");
        set.remove(5);
        System.out.println(set);

        System.out.println("Значение 21 есть = " + set.contains(21));
        System.out.println("Значение 7 есть = " + set.contains(7));


        System.out.println();
        System.out.println("Пробегаем по всем значениям (за счет структуры они отсортированы): ");
        for (Integer value : set) {
            System.out.println("value = " + value);
        }


        System.out.println();
        System.out.println("Размер = " + set.size());
        System.out.println("Пуст ли = " + set.isEmpty());
        System.out.println("-- Удаляем все элементы");
        set.clear();
        System.out.println("Размер = " + set.size());
        System.out.println("Пуст ли = " + set.isEmpty());


    }
}
