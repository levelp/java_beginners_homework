package ru.levelp.examples.oop.inheritance;

/**
 * Конкретная реализация интерфейса квартиры. Простая квартира с замком
 */
public class MyFlat implements FlatInterface {
    private Door door;

    public MyFlat() {
        door = new Door();
    }

    @Override
    public void unlockFlat() {
        door.unlock();
    }

    @Override
    public void lockFlat() {
        door.lock();
    }

    @Override
    public void goOutsideFlat() {
        if (door.isLocked()) {
            System.out.println("Не могу открыть дверь! Она закрыта!");
        } else {
            System.out.println("Дверь открыта, мой господин!");
        }
    }

    @Override
    public void goInsideFlat() {
        System.out.println("Дверь закрыта, мой господин!");
    }
}
