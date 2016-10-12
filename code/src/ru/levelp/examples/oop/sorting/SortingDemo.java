package ru.levelp.examples.oop.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Демонстрация сортировки с помощью компаратора (Comparator) и Comparable.
 */
public class SortingDemo {
    public static void main(String[] args) {
        System.out.println("Сортировка с использованием того, что Pet - Comparable:");
        System.out.println();

        Pet[] pets = createArray();
        // В "натуральном" порядке, определенном в Pet через Comparable
        Arrays.sort(pets);
        for (Pet pet : pets) {
            printPet(pet);
        }

        System.out.println();
        System.out.println("-------");
        System.out.println();
        System.out.println("Сортировка с помощью Comparator:");
        System.out.println();

        pets = createArray();
        // Этот компаратор сортирует сначала по классу, потом по возрасту, и затем по имени.
        Comparator<Pet> comparator = new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 == null || o1.getClass().getCanonicalName() == null) {
                    return -1;
                }

                if (o2 == null || o2.getClass().getCanonicalName() == null) {
                    return 1;
                }

                int result = o1.getClass().getCanonicalName().compareTo(o2.getClass().getCanonicalName());
                if (result != 0) {
                    return result;
                }

                int compare = Integer.compare(o1.getAge(), o2.getAge());
                if (compare != 0) {
                    return compare;
                }
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(pets, comparator);
        for (Pet pet : pets) {
            printPet(pet);
        }
    }

    private static void printPet(Pet pet) {
        pet.whoAmI();
        System.out.print(" ");
        pet.lookAtShoes();
        System.out.print(" ");
        pet.lookAtNewsPaper();
        System.out.println();
    }

    private static Pet[] createArray() {
        return new Pet[]{
                new Cat("Иннокентий", 12),
                new Cat("Марьяна", 9),
                new Cat("Вениамин", 19),
                new Dog("Иннокентий", 22),
                new Cat("Аркаша", 1),
                new Cat("Элеонора", 5),
                new Dog("Пончик", 1),
                new Fox("Мистер Лис", 2),
                new Dog("Любимчик", 10),
                new Cat("Граф", 14),
                new Pet("Каркуша", 3) {
                    @Override
                    public void lookAtNewsPaper() {
                        System.out.print("В гнездо - самое то!");
                    }

                    @Override
                    public void lookAtShoes() {
                        System.out.print("Не интересно1");
                    }
                },
        };
    }
}
