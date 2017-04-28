package constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Треугольник
 */
public class Triangle {
    Point A;
    Point B;
    Point C;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    }

    public Triangle(int x, int y) {
        this(new Point(x, y), new Point(x, y), new Point(x, y));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 6);
        Triangle triangle1 = new Triangle(6, 6, 3, 4, 5, 1);
        System.out.println(triangle.isDegenerate());
        System.out.println(triangle1.isDegenerate());
        Point a = triangle.A;
        a.x += 9;
        System.out.println(triangle.isDegenerate());

        List<Triangle> rotated = triangle.rotated();
        rotated.add(new Triangle(0, 0));
        for (Triangle t : rotated) {
            System.out.println(t);
        }
    }

    boolean isDegenerate() {
        return A.x == B.x && A.y == B.y && B.x == C.x && B.y == C.y;
    }

    public ArrayList<Triangle> rotated() {
        return new ArrayList<>(
                Arrays.asList(
                        this,
                        new Triangle(B.x, B.y, C.x, C.y, A.x, A.y),
                        new Triangle(C.x, C.y, A.x, A.y, B.x, B.y)
                )
        );
//        ArrayList<Triangle> list = new ArrayList<>();
//
//        list.add(this);
//        list.add(new Triangle(B.x, B.y, C.x, C.y, A.x, A.y));
//        list.add(new Triangle(C.x, C.y, A.x, A.y, B.x, B.y));
//
//        return list;
    }
}
