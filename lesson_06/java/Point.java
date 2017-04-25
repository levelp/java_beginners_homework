public class Point<T> { // T - Generic parameter
    T x;
    T y;

    Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point<Integer> pInt = new Point<>(1, 4);
        Point<Double> pDouble = new Point<>(2.3, 566.2);
    }
}
