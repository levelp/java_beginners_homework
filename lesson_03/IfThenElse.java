/**
 * @author Anastasiya Solodkaya.
 */
public class IfThenElse {
    public static void main(String[] args) {
        int i = 10;

        if (i < 2) {
            System.out.println("Too small!");
        } else if (i > 100) {
            System.out.println("Too big!");
        } else {
            System.out.println("i = " + i);
        }
    }
}
