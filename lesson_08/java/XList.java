import java.util.Iterator;

class XList<T> implements Iterable<T> {
    private Element root;

    XList() {
        root = null;
    }

    int size() {
        int size = 0;
        Element cur = root;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    T get(int index) {
        return null;
    }

    void addToEnd(T value) {
        Element el = new Element(value);
        if (root == null) {
            root = el;
        } else {
            Element cur = root;
        }
    }

    void addToBegin(T value) {
        Element el = new Element(value);
        el.next = root;
        root = el;
    }

    class Element {
        T value;
        Element next;

        Element(T value) {
            this.value = value;
        }
    }
}
