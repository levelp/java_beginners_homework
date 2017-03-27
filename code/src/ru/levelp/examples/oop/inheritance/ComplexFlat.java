package ru.levelp.examples.oop.inheritance;

/**
 * Этот класс уже проектируется как более общая сущность, которую можно расширять. Он являет собой большую квартиру с несколькими дверьми,
 * про которую мы не знаем ничего, но точно знаем, что двери у нее есть и можно войти внутрь и выйти наружу.
 * Может быть это просто двойная дверь, а может - две двери через прихожую, или целый коридор дверей?
 */
public abstract class ComplexFlat<T extends ComplexFlatPosition> implements FlatInterface {
    // Где я нахожусь? Хороший вопрос, так как можно представить, что конфигурация квартиры ожет быть разная, соответственно
    // определение локации - на совести конкретной реализации, так же как и набор локаций. Ведь с одной стороны это могут быть
    // две двери подряд, а с другой - двери с предбанником между ними.
    protected T myPosition;

    public ComplexFlat(T defaultPosition) {
        this.myPosition = defaultPosition;
    }

    @Override
    public void unlockFlat() {
        while (!myPosition.isInside()) {
            Door door = nextDoorToInside();
            if (door == null) {
                System.out.println("Просто открываем дверь");
            } else {
                // открываем замок
                door.unlock();
            }
            // продвигаемся внутрь квартиры, где бы мы ни были
            moveInside(door);
        }
    }

    @Override
    public void lockFlat() {
        while (!myPosition.isOutside()) {
            // продвигаемся наружу квартиры, где бы мы ни были
            moveOutside();
            // Смотрим, какую дверь надо закрыть
            Door door = nextDoorToInside();
            if (door == null) {
                System.out.println("Просто открываем дверь");
            } else {
                // закрываем дверь
                door.lock();
            }
        }
    }

    @Override
    public void goOutsideFlat() {
        System.out.println("Выхожу из квартиры");
        while (!myPosition.isOutside()) {
            moveOutside();
        }
    }

    @Override
    public void goInsideFlat() {
        System.out.println("Вхожу в квартиру");
        while (!myPosition.isInside()) {
            moveInside();
        }
    }


    public void whereAmI() {
        System.out.println("Я нахожусь в позиции " + myPosition.whereAmI() + "!");
    }


    public abstract void moveInside(Door door);

    public void moveInside() {
        moveInside(null);
    }

    public abstract void moveOutside();

    protected abstract Door nextDoorToInside();

    protected abstract Door nextDoorToOutside();


    /**
     * Из-за сложности алгоритма мы меняем метод, который был дефолтным.
     */
    @Override
    public void testNewFlatLock() {
        whereAmI();
        lockFlat();
        System.out.println("Вышли! Теперь открываем!");
        unlockFlat();
        whereAmI();
    }
}
