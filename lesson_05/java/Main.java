import java.util.Random;

/**
 * Created by Student06 on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр списка, где T = String
        MyArrayList<String> list = new MyArrayList<>();
        // Печатаем, является ли список пустым
        System.out.println(list.isEmpty());
        // Генерируем случайные строчки, построенные по принципу 'буква' + '!'
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            // R.nextInt(20) + 'a' -  приводит 'a' к типу int, для этого берет
            // код символа 'a',  затем же складывает со случайным числом от 0 до 19
            // После этого мы приводим все это обратно в char. То есть получается 
            // что у нас используеются случайные коды сиволов от кода 'a', и до 
            //  20го символа после 'a'. Посмотрите таблицу 
            // символов unicode или ascii, и увидите, что после символа 
            // 'a' идут все английские маленькие буквы. То есть получается, что 
            // мы используем символы от 'a' и до  't'.
            list.add(((char)(r.nextInt(20) + 'а')) + "!");
        }
        // Печатаем состояние списка
        System.out.println(list);
        // Печатаем размер списка
        System.out.println(list.size());
        // Печатаем, является ли список пустым
        System.out.println(list.isEmpty());
    }

}
