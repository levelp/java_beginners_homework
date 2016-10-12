package inheritance;

public class Animal {
    String name;
    double weight;
    int age;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println("Конструктор по-умолчанию");
    }

    void fight(Animal other) {
        System.out.println(
                name + " дерётся с "
                        + other.name);
    }

    public void dance() {

    }

}
