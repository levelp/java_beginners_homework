package circle;

public class Circle {
    double x;
    double y;
    double r;

    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    Circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }

    /**
     * Передвижение окружности
     */
    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }
}
