import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    double x, y, R;

    public Circle(double x, double y, double R) {
        if (R <= 0)
            throw new IllegalArgumentException("R >= 0");
        this.x = x;
        this.y = y;
        this.R = R;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1.2, 2.0,
                1.0);
        c1.move(1.0, 2.0);
        System.out.println("c1.x = " + c1.x);
        System.out.println("c1.y = " + c1.y);
        // PI * pow(R, 2)
        double area = c1.area();
        System.out.println("area = " + area);
        //Circle c2 = new Circle(1, 2, -1);
    }

    void move(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    double area() {
        return PI * pow(R, 2);
    }


}
