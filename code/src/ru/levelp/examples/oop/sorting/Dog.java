package ru.levelp.examples.oop.sorting;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void lookAtNewsPaper() {
        System.out.print("Это что-то не очень хорошее!");
    }

    @Override
    public void lookAtShoes() {
        System.out.print("Принести тапки хозяину?");
    }
}
