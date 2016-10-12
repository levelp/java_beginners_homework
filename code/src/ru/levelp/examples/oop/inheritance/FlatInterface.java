package ru.levelp.examples.oop.inheritance;

/**
 * Интерфейс - это контракт на то, что некий объект, реализующий интерфейсЮ должен иметь эти методы.
 *
 * -- Методы не имеют реализацию
 * -- Существуют методы "по умолчанию", которые имеют реализацию и не требуют ее
 */
public interface FlatInterface {
    /**
     * Открыть замок
     */
    void unlockFlat();

    /**
     * Закрыть дверь на замок
     */
    void lockFlat();

    /**
     * Выйти из квартиры
     */
    void goOutsideFlat();

    /**
     * Войти в квартиру
     */
    void goInsideFlat();

    /**
     * Метод по умолчанию - проверка, что новый замоок (система замков) работает корректно.
     */
    default void testNewFlatLock(){
        goOutsideFlat();
        lockFlat();
        unlockFlat();
        goInsideFlat();
    }
}
