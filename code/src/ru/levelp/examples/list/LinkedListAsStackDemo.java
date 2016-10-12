package ru.levelp.examples.list;

import java.util.LinkedList;

/**
 * Демонстрация методов работы со списком LinkedList как со структурой "стэк"
 */
public class LinkedListAsStackDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("-- Добавляем элементы");
        list.push(0);
        list.push(1);
        list.push(3);
        list.push(6);
        list.push(8);
        list.push(8);
        list.push(19);
        list.push(190);
        list.push(7);
        System.out.println(list);
        System.out.println("Наверху стека лежит элемент " + list.peek());
        System.out.println("-- Забираем верхний элемент");
        Integer el = list.pop();
        System.out.println("Забранный элемент: " + el);
        System.out.println("Наверху стека лежит элемент " + list.peek());

        System.out.println("Пуст ли стек = " + list.isEmpty());
        System.out.println("-- Удаляем все элементы");
        list.clear();
        System.out.println("Пуст ли стек = " + list.isEmpty());


    }
}
