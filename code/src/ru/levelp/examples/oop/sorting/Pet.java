package ru.levelp.examples.oop.sorting;

public abstract class Pet implements Comparable<Pet> {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public abstract void lookAtNewsPaper();

    public abstract void lookAtShoes();

    public void whoAmI() {
        System.out.print("Я - " + this.getClass().getSimpleName() + " " + name + ", " + age + " лет от роду.");
    }


    @Override
    public int compareTo(Pet o) {
        if (o == null) {
            return 1;
        }
        int result = getName().compareTo(o.getName());
        if (result != 0) {
            return result;
        }
        return Integer.compare(getAge(), o.getAge());
    }
}
