package circle;

public class ColoredCircle extends Circle {
    int color;

    ColoredCircle(double x, double y, double r, int color) {
        super(x, y, r);
        this.color = color;
    }
}
