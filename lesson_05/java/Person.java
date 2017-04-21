/**
 * Created by dstepule on 21.04.2017.
 */
public class Person {
    private int age;
    private String name;

    public Person(String name) {
        this(0, name);
    }

    public Person(int age, String name) {
        System.out.println("Common constructor");
        this.age = age;
        this.name = name;
    }

    public Person(long age, String name) {
        System.out.println("Common constructor");
        this.age = (int) age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person(10, "Oleg");
        Person person2 = new Person("Katya");
//        System.out.println("person.age = " + person.age);
//        System.out.println("person.name = " + person.name);
//        System.out.println("---------------");
//        System.out.println("person2.age = " + person2.age);
//        System.out.println("person2.name = " + person2.name);
        person2 = null;
        person = null;
        for (int i = 0; i < 100000000; i++) {
            Object y = new Object();
        }

        String[] s = new String[3];
        String[] s1 = {"abc", "cde"};
        s1[1] = "lkj";

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("FINALIZE " + name);
    }
}
