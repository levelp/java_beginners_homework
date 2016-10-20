/**
 * @author Anastasiya Solodkaya.
 */
public class StringOperations {
    public static void main(String[] args) {
        System.out.println("result : " + (2.0 / 3));
        System.out.println("result : " + 2.0 / 3);
        // не скомпилируется!
        // System.out.println(" result : " + 2 << 1);
        System.out.println("result : " + 2 + 3);
        System.out.println(2 + 3 + " - result ");

        // не скомпилируется!
//        System.out.println("result : " + 2 - 3);
        System.out.println(2 - 3 + " - result ");
    }
}
