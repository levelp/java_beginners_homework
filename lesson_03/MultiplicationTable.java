/**
 * @author Anastasiya Solodkaya.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <= 10; j++) {
                // Форматируем строку: d означает число, 5 - количество символов, отведенное для печати этого числа
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
