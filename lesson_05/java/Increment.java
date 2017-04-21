
public class Increment {
    public static void main(String[] args) {
        int a = 10;
        increment(a);
        System.out.println("a = " + a);
    }

    private static void increment(int a) {
        a += 2;
        System.out.println("a = " + a);
    }
}
