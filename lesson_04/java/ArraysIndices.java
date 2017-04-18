import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArraysIndices {
    public static void main(String[] args) {
        int[][] t = new int[0][0];
        System.out.println("t = " + t);
        System.out.println("Arrays.toString(t) = " + Arrays.toString(t));
        System.out.println("Arrays.deepToString(t) = " + Arrays.deepToString(t));

        if (t.length == 0) {
            System.out.println("Массив пустой");
        } else {
            boolean allEmpty = true;
            for (int[] tt : t) {
                if (tt.length == 0) {
                    allEmpty = false;
                    break;
                }
            }
            if (allEmpty)
                System.out.println("Массив пустой");
        }
        int[][] A = {
                {1, 2},
                {3, 4}};
        System.out.println("A = " + A);
        System.out.println("Arrays.toString(A) = " + Arrays.toString(A));
        System.out.println("Arrays.deepToString(A) = " +
                Arrays.deepToString(A));

        int[][][] A3D = {{{},
                {3, 4},
                {7, 2, 1}},
                {{3, 4}}};
        // Поиск минимума в 3D-массиве
        int min = Integer.MIN_VALUE;
        for (int[][] A2D : A3D)
            for (int[] A1D : A2D)
                for (int x : A1D)
                    if (x < min)
                        min = x;
        System.out.println("min = " + min);

        // Классы "Расширяемые массивы"
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.remove(0);
        System.out.println("al.size() = " + al.size());
    }
}
