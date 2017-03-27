package ru.levelp.examples.basics.strings;

/**
 * Демонстрация управлябщих символов в строках
 */
public class ControlCharacters {
    public static void main(String[] args) {
        System.out.println("Управляющие символы");
        System.out.print("\\n - перевод строки: ");
        System.out.print("______________\n______________");
        System.out.println();
        System.out.print("\\t - табуляция: ");
        System.out.print("______________\t______________");
        System.out.println();
        System.out.print("\\b - backspace (0 исчез): ");
        System.out.print("______________0\b______________");
        System.out.println();
        System.out.print("\\f - formfeed: ");
        System.out.print("______________\f______________");
        System.out.println();
        System.out.print("\\\\ - просто обратный слэш: ");
        System.out.print("______________\\______________");
        System.out.println();
        System.out.print("\\\' - одинарная кавычка: ");
        System.out.print("______________\'______________");
        System.out.println();
        System.out.print("\\\" - двойная кавычка: ");
        System.out.print("______________\"______________");
        System.out.println();
    }
}
