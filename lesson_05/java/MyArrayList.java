import java.util.Arrays;

/**
 * Created by Student06 on 29.11.2016.
 */
public class MyArrayList<T> {

    private Object[] array;
    // Указывает на следующее пустое место в массиве
    private int current;

    public MyArrayList(){
//        array = new Object[10];
        // Вызываем другой конструктор
        this(10);
    }

    public MyArrayList(int initialCapacity){
        // Создаем массив размера initialCapacity
        // Помним, что мы не можем сделать new T[]
        // из-за ограничений на использование generics в java (стирание типов)
        array = new Object[initialCapacity];
    }

    // T - параметр класса (см. MyArrayList<T>)
    public void add(T el){
        // Если у нас некуда вставить новый элемент, то мы увеличиваем массив
        if(array.length == current){
            // Запомнили старый массив
            Object[] oldArray = array;
            // Создали массив в 1.5 раза больше
            array = new Object[(int) (array.length * 1.5)];
            // Копируем элементы в новый массив из старого
            // Можно использовать System.arraycopy вместо этого
            for (int i = 0; i < oldArray.length; i++) {
                array[i] = oldArray[i];
            }
        }

        // Добавить в массив
        array[current] = el;
        // Сдвигаем указатель на 1 вправо
        current++;
    }

    public int size() {
        // Указатель на номер следующего элемента - по сути он и есть size
        return current;
    }

    public boolean isEmpty() {
        // Если размер 0 => список пуст
        return size() == 0;
    }

    // Метод из Object.toString, автоматически используется 
    // при конвертации массива в строку
    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", current=" + current +
                '}';
    }
}
