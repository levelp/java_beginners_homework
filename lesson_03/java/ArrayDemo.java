import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {21, 3, 3, 4, 2, 5};
        System.out.println("a[1] = " + a[1]);
        System.out.println("a[3] = " + a[3]);

        int[] A = {3, 4, 5, 6};
        int[] B = new int[3];
        System.out.println(Arrays.toString(A));
        System.arraycopy(A, 1, B, 1, 2);
        System.out.println(Arrays.toString(B));
        int[][] T = {{1, 2},
                {3, 4}};
        System.out.println(Arrays.toString(T));
        System.out.println(Arrays.deepToString(T));
    }
}
