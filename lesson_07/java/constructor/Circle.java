package constructor;

/**
 * Окружность
 */
public class Circle extends Shape {

    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
}
