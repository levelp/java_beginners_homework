package ru.levelp.examples.oop.basic;

/**
 * Демонстрация работы с простейшим классом
 */
public class BasicClassDemoMain {
    public static void main(String[] args) {
        System.out.println("-- Создание объекта через конструктор без параметров:");
        BasicClassDemo demo = new BasicClassDemo();
        System.out.println("BasicClassDemo demo = new BasicClassDemo()");
        System.out.println("demo.getX() = " + demo.getX());
        System.out.println("demo.getY() = " + demo.getY());
        System.out.println("demo.getZ() = " + demo.getZ());
        System.out.println("-- С помощью геттера зададим значения x и z:");
        System.out.println("demo.setX(6)");
        demo.setX(6);
        System.out.println("demo.setZ(7);");
        demo.setZ(7);
        System.out.println("demo.getX() = " + demo.getX());
        System.out.println("demo.getY() = " + demo.getY());
        System.out.println("demo.getZ() = " + demo.getZ());

        System.out.println();
        System.out.println();
        System.out.println("-- Создание объекта через конструктор без параметров:");
        BasicClassDemo demo2 = new BasicClassDemo(4, 10, 9);
        System.out.println("BasicClassDemo demo2 = new BasicClassDemo(4, 10, 9)");
        System.out.println("demo2.getX() = " + demo2.getX());
        System.out.println("demo2.getY() = " + demo2.getY());
        System.out.println("demo2.getZ() = " + demo2.getZ());
    }
}
