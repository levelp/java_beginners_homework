public class MultiplicationTable {
    public static void main(String[] args) {

        //
        // Вывести таблицу умножения
        // от m до n
        //  m = 2  n = 5
        //     2  3  4  5
        //  2  4  6 ...
        //  3  6  9 ...
        //  4  8 12 ...
        //  5 10 15 ...
        //
        //   4  6  8...
        //   6  9 ...
        //   8 12 ...
        //  10 15 ...


        int m = 4;
        int n = 7;
        int value = 0;
        for (int i = m; i <= n; i++) {
            for (int j = m; j <= n; j++) {
                value = i * j;
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }

        System.out.println(value);
    }
}
