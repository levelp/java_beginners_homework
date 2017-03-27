package ru.levelp.examples.list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 * Демонстрация методов работы с HashMap
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("-- Добавляем элементы");
        map.put(1, "Вася");
        map.put(7, "Петя");
        map.put(9, "Саша");
        map.put(2, "Катя");
        map.put(15, "Оля");
        map.put(18, "Алла");
        map.put(21, "Кирилл");
        map.put(5, "Вениамин");
        map.put(3, "Иннокентий");
        map.put(32, "Саша");
        System.out.println(map);

        System.out.println("-- Удаляем запись с ключом 15");
        map.remove(15);
        System.out.println(map);

        System.out.println("-- Обновляем запись с ключом 2");
        map.put(2, "Екатерина");
        System.out.println(map);

        System.out.println("Запись с ключом 21 существует = " + map.containsKey(21));
        System.out.println("Запись с ключом 21 = " + map.get(21));
        System.out.println("Запись с ключом 115 = " + map.containsKey(21));
        System.out.println("Запись со значение Вася существует = " + map.containsValue("Вася"));
        System.out.println("Запись со значение Катя существует = " + map.containsValue("Катя"));


        System.out.println();
        System.out.println("Пробегаем по всем ключам: ");
        for (Integer key : map.keySet()) {
            System.out.println(key + "[" + map.get(key) + "]");
        }

        System.out.println();
        System.out.println("Пробегаем по всем значениям: ");
        for (String value: map.values()) {
            System.out.println("value = " + value);
        }

        System.out.println();
        System.out.println("Пробегаем по всем значениям (исключая дублирование): ");
        for (String value: new HashSet<>(map.values())) {
            System.out.println("value = " + value);
        }

        System.out.println();
        System.out.println("Пробегаем по всем значениям (отсортированные): ");
        for (String value: new TreeSet<>(map.values())) {
            System.out.println("value = " + value);
        }

        System.out.println();
        System.out.println("Пробегаем по всем записям:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry = " + entry);
        }

        System.out.println();
        System.out.println("Размер = " + map.size());
        System.out.println("Пуста ли = " + map.isEmpty());
        System.out.println("-- Удаляем все элементы");
        map.clear();
        System.out.println("Размер = " + map.size());
        System.out.println("Пуста ли = " + map.isEmpty());


    }
}
