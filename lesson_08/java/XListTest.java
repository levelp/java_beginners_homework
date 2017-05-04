/**
 * Тестирование класса XList
 */
public class XListTest {
    public static void main(String[] args) {
        // Конструктор для создания списка
        XList<Integer> list = new XList<>();
        // Добавление элемента в начало
        list.addToBegin(2);
        // Добавление элемента в конец списка
        list.addToEnd(10);
        // Получение количества элементов в списке
        System.out.println("list.size() = " + list.size());
        // Получение элемента по его номеру в списке
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") = " + list.get(i));
        }
    }
}
