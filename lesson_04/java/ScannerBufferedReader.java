import java.util.Scanner;

public class ScannerBufferedReader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        System.out.println("N = " + N);
        System.out.println("Integer.toBinaryString(N) = " +
                Integer.toBinaryString(N));

        double d;
        if (in.hasNextDouble()) {
            d = in.nextDouble();
            System.out.println("d = " + d);
        } else {
            // Подчищаем буфер ввода
            System.out.println("Здесь ошиБПка");
            in.next();
        }
        System.out.println("Теперь вводим целое число");
        int t = in.nextInt();
        System.out.println("t = " + t);
    }
}
