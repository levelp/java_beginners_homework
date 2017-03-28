public class MainLinear {

    public static void main(String[] args) {
        double a, b;
        a = 2.3;
        b = 2;

        if (Double.isNaN(a) || Double.isInfinite(a) ||
                Double.isNaN(b) || Double.isInfinite(b)) {
            System.out.println("x - неопределённость");
            return;
        }
        if (a == 0) {
            if (b == 0) {
                System.out.println("x - любой");
            } else {
                System.out.println("Нет решений");
            }
        } else {
            // a != 0
            System.out.println("x = " + (-b / a));
        }
    }
}
