/**
 * @author Anastasiya Solodkaya.
 */
public class IncrementDecrementAdvanced {
    public static void main(String[] args) {
        int i = 1;

        System.out.println(i++ + ++i);
        System.out.println(i++ + --i);
        System.out.println(i++ + --i + ++i + i--);
        System.out.println(i);
    }
}
