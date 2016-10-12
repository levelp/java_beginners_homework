

public class MyList<T> {

    // Корневой элемент списка
    Element root;

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.show();

        MyList<String> strList = new MyList<>();
        strList.add("Hello");
        strList.add("World");
        strList.show();

        MyList<Object> anyList = new MyList<>();
        anyList.add(42);
        anyList.add("Hello");
        anyList.add(4.5);
        anyList.add('A');
        anyList.show();

        Object variant = 2;
        variant = "dfdsfsd";

        MyList<Number> numList = new MyList<>();
        numList.add(2.3);
        numList.add(1);
        numList.add(23234234224223L);
        numList.add(1.2f);
        //numList.add("xxx");
    }

    void add(T value) {
        Element el = new Element(value);
        el.next = root;
        root = el;
    }

    void show() {
        Element current = root;
        while (current != null) {
            System.out.println("current = " + current);
            System.out.println("current.value = " + current.value);
            System.out.println("current.next = " + current.next);
            // Переходим по ссылке
            current = current.next;
        }
        System.out.println(current);
    }

    // Один элемент списка
    class Element { // MyList.Element
        T value; // Значение
        Element next; // Ссылка на след. элемент списка

        public Element(T value) {
            this.value = value;
        }
    }

}
