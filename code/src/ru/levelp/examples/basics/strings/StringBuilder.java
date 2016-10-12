package ru.levelp.examples.basics.strings;

/**
 * Создание строк с помощью StringBuilder. Это особено актуально, когда вам нужно создавать сстроку динамически
 * (например, в цикле)
 */
public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append("Hello, it is best (")
                .append(1)
                .append(")")
                .append(" way to ");
        char[] chars = {'c', 'r', 'e', 'a', 't', 'e'};
        builder.append(chars);
        builder.append("string")
                .append(System.lineSeparator())
                .append("And now new line")
                .append("\u0021")
                .append(" \u2600\u266b\u266b\u266b");
        builder.append(System.lineSeparator());
        builder.append("And more possibilities: ");
        char first = '\uFB50';
        for (int i = 0; i < 102; i++) {
            builder.append((char) ((int) first + i));
        }
        String s = builder.toString();
        System.out.println("s = " + s);

    }
}
