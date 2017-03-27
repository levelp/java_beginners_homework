package ru.levelp.examples.list;

import java.util.LinkedList;

/**
 * Демонстрация методов работы со списком LinkedList как со структурой "двойная очередь"
 */
public class LinkedListAsDequeDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("-- Добавляем элементы в конец очереди");
        list.add(0);
        list.add(1);
        System.out.println("-- Добавляем элементы в начало очереди");
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(8);
        System.out.println("-- Добавляем элементы в конец очереди");
        list.addLast(8);
        list.addLast(19);
        list.addLast(190);
        list.addLast(7);
        System.out.println(list);
        System.out.println("Голова очереди: " + list.getFirst());
        System.out.println("Хвост очереди: " + list.getLast());
        System.out.println("-- Удаляем один элемент из начала очереди");
        list.removeFirst();
        System.out.println("-- Удаляем два элемента из конца очереди");
        list.removeLast();
        list.removeLast();
        System.out.println(list);
        System.out.println("Голова очереди: " + list.getFirst());
        System.out.println("Хвост очереди: " + list.getLast());

        System.out.println("Размер очереди = " + list.size());
        System.out.println("Пуста ли очередь = " + list.isEmpty());
        System.out.println("-- Удаляем все элементы");
        list.clear();
        System.out.println("Размер очереди = " + list.size());
        System.out.println("Пуста ли очередь = " + list.isEmpty());


    }
}
