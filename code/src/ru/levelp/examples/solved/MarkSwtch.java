package ru.levelp.examples.solved;

public class MarkSwtch {

    public static void main(String[] args) {
        char c = 'K';

        switch (c) {
            case 'A':
                System.out.println("Отлично!");
                break;
            case 'B':
            case 'C':
                System.out.println("Хорошо поработали!");
                break;
            case 'D':
                System.out.println("Неплохо! Пройдено!");
                break;
            case 'E':
                System.out.println("Пройдено!");
                break;
            case 'F':
                System.out.println("Пересдача!");
                break;
            default:
                System.out.println("Введена неверная оценка!");
        }
    }
}
