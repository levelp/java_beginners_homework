public class method_ref {
    public static void main(String[] args) {
        myMethod(Math::min);
    }

    private static void myMethod(Operation op) {
    }

    interface Operation {
        int apply(int x, int y);
    }
}
