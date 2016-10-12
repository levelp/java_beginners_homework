public class FindMinUniversal {

    static <T extends Comparable> T findMin(T... array) {
        T min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0)
                min = array[i];
        }
        return min;
    }

    public static void main(String[] args) {
        // Integer minInt = findMin < Integer > (2, 4, 5);
        //  MyClass
    }
}
