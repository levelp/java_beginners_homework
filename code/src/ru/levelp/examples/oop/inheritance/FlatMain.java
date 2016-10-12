package ru.levelp.examples.oop.inheritance;

/**
 * Created by asolodkaya on 27.03.17.
 */
public class FlatMain {
    public static void main(String[] args) {

        // ПОЛИМОРФИЗМ: мы можем работать с MyFlat и ComplexFlat черезодин интерфейс FlatInterface,
        // не задумываясь над тем, что объекты могут быть разными

        FlatInterface flat = new MyFlat();
        flat.testNewFlatLock();
        System.out.println();
        System.out.println("-----");
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        flat = new SimpleComplexFlat();
        flat.testNewFlatLock();


        System.out.println();
        System.out.println("-----");
        System.out.println();
        flat = new RandomRoutedFlat();
        flat.testNewFlatLock();
    }
}
