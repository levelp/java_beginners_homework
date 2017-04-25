package default_constructor;

public class Предок {
    String name;

    public Предок(String name) {
        System.out.println("Конструктор Предка");
    }

    public Предок() {
        System.out.println("Конструктор Предка");
    }

    void голос() {
        System.out.println("Предок.голос");
    }

    void общийМетодДляВсех() {
        System.out.println("Предок.общийМетодДляВсех");
    }
}
