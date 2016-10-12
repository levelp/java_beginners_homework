package ru.levelp.examples.oop.sorting;

public class Fox extends Pet {
    public Fox(String name, int age) {
        super(name, age);
    }

    @Override
    public void lookAtNewsPaper() {
        System.out.print("Утащу в нору!");
    }

    @Override
    public void lookAtShoes() {
        System.out.print("Пахнет странно...");
    }
}
