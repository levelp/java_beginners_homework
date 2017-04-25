import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[][] arr2; // declaration
        arr2 = new int[4][3]; // initialization
//        arr2[0] = new int[9];
//        arr2[1] = new int[1];
//        arr2[2] = new int[0];
        int[][] arr = {{1, 2}, {4, 5, 7, 1}};

        for (int[] subarray : arr) {
            for (int element : subarray) {
                System.out.println(element);
            }
        }


        int[] a = {4, 6, 7};

        System.out.println(a[1]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr[1]));

        //
        // int y = ....;
        // int[] t = new int[y];

        for (int i : a) {
            System.out.println("i = " + i);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }


        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

        int[] r = {1, 2, 3};
        int[] r1 = new int[10];
//        System.arraycopy(r, 0, r1, 3, r.length);
        System.arraycopy(r, 1, r1, 3, 2);
//        System.out.println(Arrays.deepToString(r1));
        System.out.println(r.length);
    }

}
