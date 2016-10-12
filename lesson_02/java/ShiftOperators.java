/**
 * @author Anastasiya Solodkaya.
 */
public class ShiftOperators {
    public static void main(String[] args) {
        int n = -123;

        System.out.printf("n       = %32s%n", Integer.toBinaryString(n));
        System.out.printf("n >> 1  = %32s%n", Integer.toBinaryString(n >> 1));
        System.out.printf("n >> 2  = %32s%n", Integer.toBinaryString(n >> 2));
        System.out.printf("n >> 3  = %32s%n", Integer.toBinaryString(n >> 3));
        System.out.println();
        System.out.printf("n       = %32s%n", Integer.toBinaryString(n));
        System.out.printf("n >>> 1 = %32s%n", Integer.toBinaryString(n >>> 1));
        System.out.printf("n >>> 2 = %32s%n", Integer.toBinaryString(n >>> 2));
        System.out.printf("n >>> 3 = %32s%n", Integer.toBinaryString(n >>> 3));
        System.out.println();
        System.out.printf("n       = %32s%n", Integer.toBinaryString(n));
        System.out.printf("n << 1  = %32s%n", Integer.toBinaryString(n << 1));
        System.out.printf("n << 2  = %32s%n", Integer.toBinaryString(n << 2));
        System.out.printf("n << 3  = %32s%n", Integer.toBinaryString(n << 3));
    }

}
