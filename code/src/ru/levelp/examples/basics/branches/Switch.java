package ru.levelp.examples.basics.branches;

/**
 * Демонстрация работы switch
 */
public class Switch {
    public static void main(String[] args) {
        int grade = 3;
        switch (grade){
            case 5:
                System.out.println("Отлично!");
                break;
            case 4:
                System.out.println("Очень хорошо!");
                break;
            case 3:
                System.out.println("Неплохо!");
                break;
            case 2:
            case 1:
                System.out.println("Неплохо бы пересдать!");
                break;
            default:
                System.out.println("Неверная оценка!");
                break;
        }
    }
}
