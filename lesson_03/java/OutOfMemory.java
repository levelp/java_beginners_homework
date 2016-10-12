// Демонстрация переполнения памяти (Java Heap)
public class OutOfMemory {
    public static void main(String[] args) {
        int S_1MB = 1024 * 1024;
        byte[][] bigArray = new byte[8000][];
        for (int i = 0; i < 8000; i++) {
            bigArray[i] = new byte[S_1MB];
            System.out.println((i + 1) + " MB");
        }

        // Autoboxing
        Integer i = new Integer(3) + 10;
        int a = 1221;
        Integer i2 = 21321; // a;
        i2 += 20;
        i2.toString();

        Integer.toString(a);

       // StringBuilder


        //MyClass myClass = new MyClass(3);

    }
}
