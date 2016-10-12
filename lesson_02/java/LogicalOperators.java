/**
 * @author Anastasiya Solodkaya.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 193;

        System.out.println(a < 15 && b % a < 2);
        System.out.println(a < 15 || b % a < 2);
        System.out.println(!(a < 15 || b % a < 2));
    }
}
