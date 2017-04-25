package default_constructor;

public class Демонстрация {
    public static void main(String[] args) {
        Предок предок = new Предок("xxx");
        System.out.println("---------------");
        Наследник x = new Наследник();
        x.голос();

        Наследник2 наследник2 = new Наследник2();
        наследник2.голос();
    }
}
