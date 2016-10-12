package ru.levelp.examples.lambda;

/**
 * Представляет собой интерфейс для использовании в лямбда выражениях. Бинарна операция для аккумулятора и "следующего" числа
 */
public interface BinaryOperation {
    long apply(long a1, int a2);
}
