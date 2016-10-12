package ru.levelp.examples.oop.inheritance;

import java.util.Random;

/**
 * Created by asolodkaya on 27.03.17.
 */
public class RandomRoutedFlat extends ComplexFlat<RandomRoutedFlat.Position> {

    private Door outerDoor = new Door("входная");
    private Door room1Door = new Door("в красную комнату");
    private Door room2Door = new Door("в синюю комнату");
    private Door room3Door = new Door("в зеленую комнату");
    private Random random = new Random();

    public RandomRoutedFlat() {
        super(Position.ROOM3);
    }

    @Override
    public void moveInside(Door door) {
        switch (myPosition) {
            case OUTSIDE:
                myPosition = Position.BETWEEN_DOORS;
                break;
            case BETWEEN_DOORS:
                myPosition = door == room1Door ? Position.ROOM1 : Position.ROOM2;
                break;
            case ROOM2:
                myPosition = Position.ROOM3;
                break;
            case ROOM1:
            case ROOM3:
                break;
        }
    }

    @Override
    public void moveOutside() {
        Door door = nextDoorToOutside();
        if (door != null && door.isLocked()) {
            System.out.println("Не могу войти! Дверь " + door.getName() + " закрыта на замок!");
            return;
        }
        switch (myPosition) {
            case OUTSIDE:
                System.out.println("Я уже вышел!");
                break;
            case BETWEEN_DOORS:
                System.out.println("Выхожу");
                myPosition = Position.OUTSIDE;
                break;
            case ROOM3:
                System.out.println("Выхожу в синюю комнату");
                myPosition = Position.ROOM2;
                break;
            case ROOM2:
            case ROOM1:
                System.out.println("Выхожу в предбанник");
                myPosition = Position.BETWEEN_DOORS;
                break;
        }
    }

    @Override
    protected Door nextDoorToInside() {
        switch (myPosition) {
            case OUTSIDE:
                return outerDoor;
            case BETWEEN_DOORS:
                boolean b = random.nextBoolean();
                return b ? room1Door : room2Door;
            case ROOM2:
                return room3Door;
            case ROOM1:
            case ROOM3:
            default:
                return null;
        }
    }

    @Override
    protected Door nextDoorToOutside() {
        switch (myPosition) {
            case OUTSIDE:
                return null;
            case BETWEEN_DOORS:
                return outerDoor;
            case ROOM1:
                return room1Door;
            case ROOM2:
                return room2Door;
            case ROOM3:
                return room3Door;
            default:
                return null;
        }
    }

    public enum Position implements ComplexFlatPosition {
        OUTSIDE(false, true, "снаружи квартиры"), BETWEEN_DOORS(false, false, "между дверей"),
        ROOM1(true, false, "красная комната"), ROOM2(false, false, "синяя комната"), ROOM3(true, false, "зеленая комната");

        private boolean inside;
        private boolean outside;
        private String position;

        Position(boolean inside, boolean outside, String position) {
            this.inside = inside;
            this.outside = outside;
            this.position = position;
        }

        @Override
        public boolean isInside() {
            return inside;
        }

        @Override
        public boolean isOutside() {
            return outside;
        }

        @Override
        public String whereAmI() {
            return position;
        }
    }
}
