package ru.levelp.examples.oop.inheritance;

/**
 * Класс, который не реализует никаких интерфейсов. Представляет собой дверь
 */
public class Door {
    private boolean locked;
    private String name;

    public Door(String name) {
        this.name = name;
    }

    public Door() {
        this("");
    }

    public void lock(){
        if(locked){
            throw new IllegalStateException("Door " + name + "is already locked!");
        }
        this.locked = true;
        System.out.println("Дверь " + name + " закрыта!");
    }

    public void unlock(){
        if(!locked){
            throw new IllegalStateException("Door " + name + " is already unlocked!");
        }
        this.locked = false;
        System.out.println("Дверь " + name + " открыта");
    }

    public boolean isLocked() {
        return locked;
    }

    public String getName() {
        return name;
    }
}
