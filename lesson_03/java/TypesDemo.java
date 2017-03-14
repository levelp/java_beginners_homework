public class TypesDemo {

    static int m = 3;
    static int n = 2;


    public static void main(String[] args) {
//        int i1 = 10;
//        long i2 = 1000000000000000000L;
//        int i3 = (int)i2;
//        System.out.println("i3 = " + i3);
//        System.out.println(Long.toBinaryString(i2));
//        System.out.println(Integer.toBinaryString(i3));
//        Integer integer = 3;
//        int y = integer;
//        test(integer);
//
//
//        String s = "abc";
//        String s1 = "abc";
//        String s2 = "ab" + "c";
//        String s3 = "ab";
//        s3 += "c";
//        s = s.trim();
//
////        System.out.println(s == s1);
////        System.out.println(s == s2);
//        System.out.println("result: " + (2 << 1));

        int m = 5;
        int n = 25;
        int len = Integer.toString(n * n).length() + 1;
        String format = "%" + len + "d";
        for (int i = m; i <= n; i++) {
            for (int j = m; j <= n; j++) {
                System.out.printf(format, i * j);
            }
            System.out.println();
        }

        test();
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }


    public static void test() {
//        int temp = m;
//        m = n;
//        n = temp;

        n = n + m - (m = n);
    }
}
