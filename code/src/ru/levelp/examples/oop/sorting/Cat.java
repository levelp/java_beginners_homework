package ru.levelp.examples.oop.sorting;

public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void lookAtNewsPaper() {
        System.out.print("Рррр! Я не люблю газеты!");
    }

    @Override
    public void lookAtShoes() {
        System.out.print("Ооо! Новый туалет!");
    }
}
