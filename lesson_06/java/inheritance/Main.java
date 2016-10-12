package inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Васька");
        Dog dog = new Dog("Каштанка");
        //cat.danceWith(dog);
        cat.fight(dog);
        dog.fight(cat);
        cat.dance();
    }
}
