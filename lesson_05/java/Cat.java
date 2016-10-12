public class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        System.out.println("(1) " + cat.toString());
        cat = new Cat("Мурка");
        System.out.println("(2) " + cat.toString());
        replace(cat);
        System.out.println("(5) " + cat.toString());
        System.out.println("cat.name = " + cat.name);
    }

    private static void replace(Cat cat) {
        cat.name = "Милка";
        System.out.println("(3) " + cat.toString());
        cat = new Cat("Мурка");
        System.out.println("(4) " + cat.toString());
        //replace(cat);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Кот помер: " + name);
    }
}
