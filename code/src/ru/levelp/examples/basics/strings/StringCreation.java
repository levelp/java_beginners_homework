package ru.levelp.examples.basics.strings;

/**
 * Базовые способы создания строк. Демонстрация сравнения строк
 */
public class StringCreation {
    public static void main(String[] args) {
        // Как создать строку
        String a = "abc";
        String b = "abc";
        String c = "ab" + "c";
        // так лучше не делать, конечно
        String d = new String("abc");
        String e = "ab";
        e += "c";
        // Фича джавы - строка создается лишь один раз, поэтому сравнение по ссылке вернет true, ведь это один и тот же объект,
        // хотя это сразу не очевидно
        System.out.println("Это одинаковые объекты:");
        System.out.println("a == b  = " + (a == b));
        System.out.println("a == c  = " + (a == c));
        // А здесь мы сравниваем разыне объекты, поэтому уже по-другому
        System.out.println();
        System.out.println("Это разные объекты:");
        System.out.println("a == d  = " + (a == d));
        System.out.println("a == e  = " + (a == e));

        // Однако, если сравнивать правильно (по содержимому строк), т овсе они эквивалентны:
        System.out.println();
        System.out.println("Но у всех них содержание одинаковое:");
        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a.equals(c) = " + a.equals(c));
        System.out.println("a.equals(d) = " + a.equals(d));
        System.out.println("a.equals(e) = " + a.equals(e));

        // А вот тут можно увидеть разницу в сравнении с учетом регистра
        System.out.println();
        System.out.println("Сравнение содержания с учетом регистра:");
        System.out.println("a.equals(\"abc\") = " + a.equals("abc"));
        System.out.println("a.equals(\"aBc\") = " + a.equals("aBc"));
        System.out.println();
        System.out.println("Сравнение содержания без учета регистра:");
        System.out.println("a.equalsIgnoreCase(\"abc\") = " + a.equalsIgnoreCase("abc"));
        System.out.println("a.equalsIgnoreCase(\"aBc\") = " + a.equalsIgnoreCase("aBc"));
    }
}
