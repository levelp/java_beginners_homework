package default_constructor;

public class Наследник extends Предок {
    public Наследник() {
        System.out.println("Конструктор Наследника");
    }

    void голос() {
        System.out.println("Наследник.голос");
        super.голос();
    }
}
