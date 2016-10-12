import java.util.Arrays;
import java.util.Random;

public class SumDemo {
    public static void main(String[] args) {

        Random random = new Random();
        int[] myArray = new int[random.nextInt(30) + 10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }


        for (int t = 0; t < 100; t++) {


//        for (int i = 0; i < 100; i++) {
//            // 0...100
//            // + 10 -> 10...110
//            // 20...41
//            // a <= x <= b    a = 20, b = 41
//            // a1 <= x - 20 <= b1  a1 = 0, b = 21
//            System.out.println(random.nextInt(21) + 20);
////            random.
//        }

            int[] marks = new int[random.nextInt(21) + 20];
            for (int i = 0; i < marks.length; i++) {
                marks[i] = 2 + random.nextInt(4);
            }
//        marks[0] = 4;
//        marks[1] = 3;
//        marks[2] = 5;
//
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            System.out.println("Total: " + total);
            System.out.println("Source marks: " + Arrays.toString(marks));
        }
    }
}
