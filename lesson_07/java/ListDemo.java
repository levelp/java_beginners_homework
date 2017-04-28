import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by HP on 28.04.2017.
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = Arrays.asList(4, 5, 6);
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);

        System.out.println(sum(list1));
        System.out.println(sum(list2));
        System.out.println(sum(list3));

//
//        int result = 0;
//        for (int el: list2) {
//            result += el;
//        }
//        System.out.println(result);
//
//        while(!list2.isEmpty()){
//            Integer poll = list2.poll();
//            System.out.println("poll = " + poll);
//        }
    }

    private static int sum(List<Integer> list) {
        int result = 0;
        for (int el : list) {
            result += el;
        }
        return result;
    }
}
