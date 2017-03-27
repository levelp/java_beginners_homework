package ru.levelp.examples.oop.basic;

/**
 * Базовый пример класса. Представляет собой сущность точки в трехмерном пространстве.
 *
 * Здесь можно увидеть:
 *  -- объявление полей
 *  -- конструкторы
 *  -- создание более частного конструктора через более общий
 *  -- геттеры и сеттеры для каждого поля
 */
public class BasicClassDemo {
    // поле x
    private double x;
    // поле y
    private double y;
    // поле z
    private double z;

    // Конструктор, который создает точку с координатами (0, 0, 0)
    public BasicClassDemo() {
        // Обращение к более общему конструктору (см. ниже)
        this(0, 0, 0);
    }

    // Конструктор, который создает точку с заданными координатами (x, y, z)
    public BasicClassDemo(double x, double y, double z1) {
        // ключевое слово this позволяет отличить поле x от параметра x
        this.x = x;
        this.y = y;
        // Нет перекрытия имен полей и переменных => можем не спользовать слово this
        z = z1;
    }

    // геттер для x
    public double getX() {
        return x;
    }

    // сеттер для x
    public void setX(double x) {
        this.x = x;
    }

    // геттер для y
    public double getY() {
        return y;
    }

    // сеттер для y
    public void setY(double y) {
        this.y = y;
    }

    // геттер для z
    public double getZ() {
        return z;
    }

    // сеттер для z
    public void setZ(double z) {
        this.z = z;
    }
}
