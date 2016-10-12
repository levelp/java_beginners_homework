package ru.levelp.examples.oop.modifiers.inner;

import ru.levelp.examples.oop.modifiers.AccessModifiersDemo;

/**
 * Created by asolodkaya on 27.03.17.
 */
public class InheritanceScopeMain extends AccessModifiersDemo {
    protected InheritanceScopeMain(double smallTownSecret) {
        super(smallTownSecret);
    }

    public InheritanceScopeMain(int myInternalSecret, String neighboursInformation, double smallTownSecret, String name) {
        super(myInternalSecret, neighboursInformation, smallTownSecret, name);
    }

    public static void main(String[] args) {
        // КОНСТРУКТОРЫ //

        // Доступ к public конструктору есть
        InheritanceScopeMain ih1 = new InheritanceScopeMain(1, "dd", 0.3, "NAME");
        AccessModifiersDemo d1 = ih1;
        // Доступ к package-local конструктору отсутствует
//        AccessModifiersDemo d2 = new AccessModifiersDemo("dd");
        // Доступ к protected конструктору отсутствует (см. выше - он есть внутри конструктора этого класса)
//        AccessModifiersDemo d3 = new AccessModifiersDemo(4.9);
        // Доступ к private конструктору отсутствует
//        AccessModifiersDemo d4 = new AccessModifiersDemo(2, "abc");

        // ПОЛЯ //
        // Доступ к public полю есть
        System.out.println("d1.name = " + d1.name);

        // !!!!!!!!!!!!!!!!
        // Доступ к protected полю отсутствует через ссылку на AccessModifiersDemo
//        System.out.println("d1.smallTownSecret = " + d1.smallTownSecret);
        // Доступ к protected полю есть через ссылку на этот класс, хотя объект тот же
        System.out.println("ih1.smallTownSecret = " + ih1.smallTownSecret);
        // !!!!!!!!!!!!!!!!

        // Доступ к package-local полю отсутствует
//        System.out.println("d1.neighboursInformation = " + d1.neighboursInformation);
        // Доступ к private полю отсутствует
//        System.out.println("d1.myInternalSecret = " + d1.myInternalSecret);

        // КОНСТАНТЫ //
        // Доступ к public константе есть
        System.out.println("AccessModifiersDemo.PUBLIC_CONST = " + AccessModifiersDemo.PUBLIC_CONST);
        // Доступ к protected константе есть
        System.out.println("AccessModifiersDemo.PROTECTED_CONST = " + AccessModifiersDemo.PROTECTED_CONST);
        // Доступ к package-local константе отсутствует
//        System.out.println("AccessModifiersDemo.PACKAGE_LOCAL_CONST = " + AccessModifiersDemo.PACKAGE_LOCAL_CONST);
        // Доступ к private константе отсутствует
//        System.out.println("AccessModifiersDemo.PRIVATE_CONST = " + AccessModifiersDemo.PRIVATE_CONST);

        // МЕТОДЫ //
        // Доступ к public методу есть
        d1.publicMethod();

        // !!!!!!!!!!!!!!!!
        // Доступ к protected методу отсутствует через ссылку на AccessModifiersDemo
//        d1.protectedMethod();
        // Доступ к protected методу есть через ссылку на этот класс, хотя объект тот же
        ih1.protectedMethod();
        // !!!!!!!!!!!!!!!!

        // Доступ к package-local методу отсутствует
//        d1.packageLocalMethod();
        // Доступ к private методу отсутствует
//        d1.privateMethod();
    }

}
