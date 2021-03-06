package ru.levelp.examples.list;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Демонстрация методов работы со списком ArrayList
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("-- Добавляем элементы");
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(19);
        list.add(190);
        list.add(0);
        list.add(7);
        System.out.println(list);
        System.out.println("-- Удаляем элемент со _значением_ 6");
        list.remove(new Integer(6));
        System.out.println(list);
        System.out.println("-- Удаляем элемент с _индексом_ 5");
        list.remove(5);
        System.out.println(list);
        System.out.println("Пробегаем по весм значениям (в порядке нахождения в списке):");
        for (Integer value : list) {
            System.out.println("value = " + value);
        }
        System.out.println(list);

        System.out.println("Размер списка = " + list.size());
        System.out.println("Пуст ли список = " + list.isEmpty());
        System.out.println("-- Удаляем все элементы");
        list.clear();
        System.out.println("Размер списка = " + list.size());
        System.out.println("Пуст ли список = " + list.isEmpty());


    }
}
