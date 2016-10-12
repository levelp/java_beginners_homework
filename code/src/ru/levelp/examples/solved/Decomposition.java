import java.util.Scanner;

import static java.lang.Math.min;

public class Decomposition {

    private static int N;
    static int[] A;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        A = new int[N];

        rec(N, N, 0);
    }

    /**
     * @param sum   Какая сумма осталась
     * @param limit Ограничение сверху (элемент который левее всего)
     * @param size  Сколько мы слагаемых уже поставили
     */
    private static void rec(int sum, int limit, int size) {
        // Остановка рекурсии
        if (sum == 0) {
            System.out.print(N + " = " + A[0]);
            for (int i = 1; i < size; i++) {
                System.out.print(" + " + A[i]);
            }
            System.out.println();
            return;
        }
        // Раскладываем оставшуюся сумму
        for (int x = min(limit, sum); x >= 1; x--) {
            A[size] = x; // Поставили элемент x
            rec(sum - x, x, size + 1);
        }
    }
}
