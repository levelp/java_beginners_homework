import default_constructor.Предок;

public class FindMinDemo<T extends Comparable> {
    public static void main(String[] args) {
        Предок предок = new Предок();
        FindMinDemo<Integer> findIntMin = new FindMinDemo<>();
        findIntMin.findMin(2, 5, 1);
        //FindMinDemo<MyClass> findMyClassMin
        //         = new FindMinDemo<>();
      /*  findMyClassMin.findMin(
                new MyClass(1),
                new MyClass(3),
                new MyClass(2)
        );*/
    }

    private void findMin(T... array) {
        T min = array[0];
        for (T x : array) {
            //if (x < min) {
//
            // }
        }
    }
}
