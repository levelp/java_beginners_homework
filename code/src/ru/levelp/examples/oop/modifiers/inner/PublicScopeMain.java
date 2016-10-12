package ru.levelp.examples.oop.modifiers.inner;

import ru.levelp.examples.oop.modifiers.AccessModifiersDemo;

/**
 * Created by asolodkaya on 27.03.17.
 */
public class PublicScopeMain {
    public static void main(String[] args) {
        // КОНСТРУКТОРЫ //

        // Доступ к public конструктору есть
        AccessModifiersDemo d1 = new AccessModifiersDemo(1, "dd", 0.3, "NAME");
        // Доступ к package-local конструктору отсутствует
//        AccessModifiersDemo d2 = new AccessModifiersDemo("dd");
        // Доступ к protected конструктору отсутствует
//        AccessModifiersDemo d3 = new AccessModifiersDemo(4.9);
        // Доступ к private конструктору отсутствует
//        AccessModifiersDemo d4 = new AccessModifiersDemo(2, "abc");

        // ПОЛЯ //
        // Доступ к public полю есть
        System.out.println("d1.name = " + d1.name);
        // Доступ к protected полю отсутствует
//        System.out.println("d1.smallTownSecret = " + d1.smallTownSecret);
        // Доступ к package-local полю отсутствует
//        System.out.println("d1.neighboursInformation = " + d1.neighboursInformation);
        // Доступ к private полю отсутствует
//        System.out.println("d1.myInternalSecret = " + d1.myInternalSecret);

        // КОНСТАНТЫ //
        // Доступ к public константе есть
        System.out.println("AccessModifiersDemo.PUBLIC_CONST = " + AccessModifiersDemo.PUBLIC_CONST);
        // Доступ к protected константе отсутствует
//        System.out.println("AccessModifiersDemo.PROTECTED_CONST = " + AccessModifiersDemo.PROTECTED_CONST);
        // Доступ к package-local константе отсутствует
//        System.out.println("AccessModifiersDemo.PACKAGE_LOCAL_CONST = " + AccessModifiersDemo.PACKAGE_LOCAL_CONST);
        // Доступ к private константе отсутствует
//        System.out.println("AccessModifiersDemo.PRIVATE_CONST = " + AccessModifiersDemo.PRIVATE_CONST);

        // МЕТОДЫ //
        // Доступ к public методу есть
        d1.publicMethod();
        // Доступ к protected методу отсутствует
//        d1.protectedMethod();
        // Доступ к package-local методу отсутствует
//        d1.packageLocalMethod();
        // Доступ к private методу отсутствует
//        d1.privateMethod();
    }

}
