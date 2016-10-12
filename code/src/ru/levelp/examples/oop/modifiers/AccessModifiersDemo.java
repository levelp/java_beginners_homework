package ru.levelp.examples.oop.modifiers;

// Класс верхнего уровня - public!
public class AccessModifiersDemo {
    // ----- Доступны только самому классу! ----- //
    // поле
    private int myInternalSecret;
    // константа (по сути), неизменяемое статическое поле
    private static final int PRIVATE_CONST = 0;

    // метод
    private void privateMethod() {

    }
    // констркутор
    private AccessModifiersDemo(int myInternalSecret, String s) {
        this.myInternalSecret = myInternalSecret;
        System.out.println("s = " + s);
    }

    // -----  Доступны только тем, кто лежит в этом пакете ----- //
    // поле
    String neighboursInformation;
    // константа (по сути), неизменяемое статическое поле
    static final int PACKAGE_LOCAL_CONST = 42;

    // метод
    int packageLocalMethod() {
        return 0;
    }

    // конструктор
    AccessModifiersDemo(String neighboursInformation) {
        this.neighboursInformation = neighboursInformation;
    }

    // ----- Доступны тем, кто лежит в этом пакете и всем наследникам (т.е. и наследникам из других пакетов) ----- //
    // поле
    protected double smallTownSecret;
    // константа (по сути), неизменяемое статическое поле
    protected static final double PROTECTED_CONST = 0.991;

    // метод
    protected double protectedMethod() {
        return 0.0;
    }

    // конструктор
    protected AccessModifiersDemo(double smallTownSecret) {
        this.smallTownSecret = smallTownSecret;
    }

    // ----- Доступны вообще всем. ----- //
    // поле
    public String name;
    // константа (по сути), неизменяемое статическое поле
    public static final String PUBLIC_CONST = "abvc";

    // метод
    public String publicMethod() {
        return "";
    }

    // конструктор
    public AccessModifiersDemo(int myInternalSecret, String neighboursInformation, double smallTownSecret, String name) {
        this.myInternalSecret = myInternalSecret;
        this.neighboursInformation = neighboursInformation;
        this.smallTownSecret = smallTownSecret;
        this.name = name;
    }



    public static void main(String[] args) {
        // КОНСТРУКТОРЫ //

        // Доступ к public конструктору есть
        AccessModifiersDemo d1 = new AccessModifiersDemo(1, "dd", 0.3, "NAME");
        // Доступ к package-local конструктору есть
        AccessModifiersDemo d2 = new AccessModifiersDemo("dd");
        // Доступ к protected конструктору есть
        AccessModifiersDemo d3 = new AccessModifiersDemo(4.9);
        // Доступ к private конструктору есть
        AccessModifiersDemo d4 = new AccessModifiersDemo(2, "abc");

        // ПОЛЯ //
        // Доступ к public полю есть
        System.out.println("d1.name = " + d1.name);
        // Доступ к protected полю есть
        System.out.println("d1.smallTownSecret = " + d1.smallTownSecret);
        // Доступ к package-local полю есть
        System.out.println("d1.neighboursInformation = " + d1.neighboursInformation);
        // Доступ к private полю есть
        System.out.println("d1.myInternalSecret = " + d1.myInternalSecret);

        // КОНСТАНТЫ //
        // Доступ к public константе есть
        System.out.println("AccessModifiersDemo.PUBLIC_CONST = " + AccessModifiersDemo.PUBLIC_CONST);
        // Доступ к protected константе есть
        System.out.println("AccessModifiersDemo.PROTECTED_CONST = " + AccessModifiersDemo.PROTECTED_CONST);
        // Доступ к package-local константе есть
        System.out.println("AccessModifiersDemo.PACKAGE_LOCAL_CONST = " + AccessModifiersDemo.PACKAGE_LOCAL_CONST);
        // Доступ к private константе есть
        System.out.println("AccessModifiersDemo.PRIVATE_CONST = " + AccessModifiersDemo.PRIVATE_CONST);

        // МЕТОДЫ //
        // Доступ к public методу есть
        d1.publicMethod();
        // Доступ к protected методу есть
        d1.protectedMethod();
        // Доступ к package-local методу есть
        d1.packageLocalMethod();
        // Доступ к private методу есть
        d1.privateMethod();
    }
}

// Класс не верхнего уровня - не public! Не можем иметь два public класса в одном файле!
class UseOnlyHere {

}
