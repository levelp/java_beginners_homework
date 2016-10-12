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
        System.out.println("Shape = " + A);
        System.out.println("Arrays.toString(Shape) = " + Arrays.toString(A));
        System.out.println("Arrays.deepToString(Shape) = " +
                Arrays.deepToString(A));

        // Классы "Расширяемые массивы"
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.remove(0);
        System.out.println("al.size() = " + al.size());
    }
}
