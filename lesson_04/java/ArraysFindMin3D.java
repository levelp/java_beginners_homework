import java.util.Arrays;

public class ArraysFindMin3D {
    public static void main(String[] args) {
        int[][][] A3D = {
                { // 2D 0
                        {}, // 1D
                        {3, 4},
                        {7, 2, 1}
                },
                { // 2D 1
                        {3, 4},
                        {1000},
                }
        };
        findMin3D(A3D);
        A3D = new int[][][]{
                {},
                {
                        {},
                        {Integer.MAX_VALUE}
                }
        };
        findMin3D(A3D);
        A3D = new int[][][]{
                {},
                {
                        {},
                        {}
                }
        };
        findMin3D(A3D);
    }

    private static void findMin3D(int[][][] A3D) {
        System.out.println(Arrays.deepToString(A3D));
        // Поиск минимума в 3D-массиве
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int[][] A2D : A3D) // Каждый элемент 2D
            for (int[] A1D : A2D) // Каждый элемент 1D
                for (int x : A1D) { // Каждый элемент - число
                    if (x < min) {
                        min = x;
                    }
                    found = true;
                }
        if (!found) // index == false
            System.out.println("Массивы пустые");
        else
            System.out.println("min = " + min);
    }
}
