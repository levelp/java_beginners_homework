import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Метро Санкт-Петербурга");
        System.out.print("Введите номер ветки метро: ");
        int N = scanner.nextInt();
        switch (N) {
            case 1:
                System.out.println("Красная: Проспект Ветеранов - Девяткино");

                case 2:
                System.out.println("Синяя: Купчино - Парнас");
                break;
            case 3:
                System.out.println("Зёлёная: Приморская - Рыбацкое");
                break;
            case 4:
                System.out.println("Жёлтая: Спасская - Улица Дыбенко");
                break;
            case 5:
                System.out.println("Фиолетовая: Комендантский проспект - Международная");
                break;
            default:
                System.out.println("Такой ветки ещё не построено");
        }
    }
}
