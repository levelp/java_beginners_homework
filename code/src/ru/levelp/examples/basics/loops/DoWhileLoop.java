package ru.levelp.examples.basics.loops;

/**
 * Демонстрация работы цикла do-while
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        System.out.println("---");

        i = 0;
        do {
            System.out.println(i);
            i++;
            if(i == 10){
                break;
            }
        } while (true);
    }
}
