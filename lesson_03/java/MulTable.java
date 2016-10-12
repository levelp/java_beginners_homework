public class MulTable {
    public static void main(String[] args) {
        final int SIZE = 14;
        // i - номер строки 1..SIZE
        for (int i = 1; i <= SIZE; i++) {
            // j - номер столбца 1..SIZE
            for (int j = 1; j <= SIZE; j++) {
                if (j >= 5 && j <= 9) {
                    continue;
                }
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
