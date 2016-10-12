package ru.levelp.examples.oop.inheritance;

/**
 * Created by asolodkaya on 27.03.17.
 */
public class SimpleComplexFlat extends ComplexFlat<SimpleComplexFlat.Position> {
    protected Door doorOuter = new Door("Внешняя");
    protected Door doorInner = new Door("Внутренняя");

    public SimpleComplexFlat() {
        super(Position.INSIDE);
    }

    @Override
    public void moveInside(Door door) {
        if (door != null && door.isLocked()) {
            System.out.println("Не могу войти! Дверь " + door.getName() + " закрыта на замок!");
            return;
        }
        switch (myPosition) {
            case OUTSIDE:
                System.out.println("Вхожу в предбанник");
                myPosition = Position.BETWEEN_DOORS;
                break;
            case BETWEEN_DOORS:
                System.out.println("Вхожу внутрь");
                myPosition = Position.INSIDE;
                break;
            case INSIDE:
                System.out.println("Я уже внутри!");
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
            case INSIDE:
                System.out.println("Выхожу в предбанник");
                myPosition = Position.BETWEEN_DOORS;
                break;
        }
    }

    @Override
    protected Door nextDoorToInside() {
        switch (myPosition) {
            case OUTSIDE:
                return doorOuter;
            case BETWEEN_DOORS:
                return doorInner;
            case INSIDE:
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
                return doorOuter;
            case INSIDE:
            default:
                return doorInner;
        }
    }


    public enum Position implements ComplexFlatPosition {
        OUTSIDE(false, true, "снаружи квартиры"), BETWEEN_DOORS(false, false, "между дверей"), INSIDE(true, false, "внутри квартиры");
        private boolean terminalInside;
        private boolean terminalOutside;
        private String position;

        Position(boolean terminalInside, boolean terminalOutside, String position) {
            this.terminalInside = terminalInside;
            this.terminalOutside = terminalOutside;
            this.position = position;
        }



        @Override
        public boolean isInside() {
            return terminalInside;
        }

        @Override
        public boolean isOutside() {
            return terminalOutside;
        }

        @Override
        public String whereAmI() {
            return position;
        }
    }
}
