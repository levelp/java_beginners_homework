import java.math.BigInteger;

public class BigIntegerDemo {

    public static final int FACT = 81;

    public static void main(String[] args) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 2; i < FACT; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(FACT + "! = " + fact);

        String s = "5328475983250032587432050432";
        BigInteger bi = new BigInteger(s);
        //bi = s;
    }
}
