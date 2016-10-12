package ru.levelp.examples.basics.strings;

import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

/**
 * Форматирование строк: Strong.format, System.out.printf и
 */
public class StringFormat {
    public static void main(String[] args) {
        System.out.printf("%%n - перевод строки: %n");
        System.out.printf("%%%% - знак процента: %%%n");
        System.out.printf("%%d - целое число%n");
        System.out.printf("%%f - float/double число%n");
        System.out.printf("%%s - просто строка%n");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------");
        System.out.println("Числа:");
        System.out.println("-----------");
        System.out.println();
        System.out.printf("Целое число (%%d%%n): %d%n", 76);
        System.out.println();
        System.out.println("Целое число фиксированной длины 3 (%%3d)");
        System.out.printf("[%%3d] -> %3d%n", 1);
        System.out.printf("[%%3d] -> %3d%n", 12);
        System.out.printf("[%%3d] -> %3d%n", 123);
        System.out.printf("[%%3d] -> %3d%n", -12);
        System.out.println("Целое число фиксированной длины 10 (%%120d)");
        System.out.printf("[%%10d] -> %10d%n", 1);
        System.out.printf("[%%10d] -> %10d%n", 12);
        System.out.printf("[%%10d] -> %10d%n", 123);
        System.out.printf("[%%10d] -> %10d%n", 123456789);
        System.out.printf("[%%10d] -> %10d%n", -123456789);
        System.out.printf("[%%10d] -> %10d%n", 1234567890);
        System.out.println("Целое число фиксированной длины 3 с добавлением нулей в начале (%%03d)");
        System.out.printf("[%%03d] -> %03d%n", 1);
        System.out.printf("[%%03d] -> %03d%n", 12);
        System.out.printf("[%%03d] -> %03d%n", 123);
        System.out.printf("[%%03d] -> %03d%n", -12);
        System.out.println();
        System.out.println("Числа с плавающей точкой форматируются по умолчанию с 6ю знаками после запятой");
        System.out.println("Работает и для float, и для double:");
        System.out.printf("[%%f] ->  %f (float)%n", 76f);
        System.out.printf("[%%f] ->  %f (double)%n", 92d);
        System.out.printf("[%%f] ->  %f (double)%n", Double.NaN);
        System.out.println("Число с плавающей точкой фиксированной длины 15 (%15f):");
        System.out.printf("[%%15f] -> %15f%n", 78d);
        System.out.printf("[%%15f] -> %15f%n", 78.1d);
        System.out.printf("[%%15f] -> %15f%n", 788.1d);
        System.out.printf("[%%15f] -> %15f%n", 788888.1099927827d);
        System.out.printf("[%%15f] -> %15f%n", -788888.1099927827d);
        System.out.println("Число с плавающей точкой фиксированной длины 15 с добавлением нулей в начале (%015f):");
        System.out.printf("[%%015f] -> %015f%n", 78d);
        System.out.printf("[%%015f] -> %015f%n", 788.109992727d);
        System.out.printf("[%%015f] -> %015f%n", 788888.1099927827d);
        System.out.printf("[%%015f] -> %015f%n", -788888.1099927827d);
        System.out.printf("[%%015f] -> %015f%n", Double.NaN);
        System.out.printf("[%%015f] -> %015f%n", Double.POSITIVE_INFINITY);
        System.out.printf("[%%015f] -> %015f%n", Double.NEGATIVE_INFINITY);
        System.out.printf("[%%015f] -> %015f%n", +0d);
        System.out.printf("[%%015f] -> %015f%n", -0d);
        System.out.println();
        System.out.println("Обязательый вывод знака числа: (%+f, %+d)");
        System.out.printf("[%%+f] -> %+f%n", 78d);
        System.out.printf("[%%+f] -> %+f%n", -78d);
        System.out.printf("[%%+015f] -> %+015f%n", 78d);
        System.out.printf("[%%+015f] -> %+015f%n", -78d);
        System.out.printf("[%%+d] -> %+d%n", 712);
        System.out.printf("[%%+d] -> %+d%n", -712);
        System.out.printf("[%%+015d] -> %+015d%n", 712);
        System.out.printf("[%%+015d] -> %+015d%n", -712);
        System.out.println();
        System.out.println("Указание, сколько знаков после запятой у числа с плавающей точкой печатать: (например, %.3f)");
        System.out.printf("[%%f] -> %f%n", 23.4567);
        System.out.printf("[%%.3f] -> %.3f%n", 23.4567);
        System.out.printf("[%%.10f] -> %.10f%n", 23.4567);
        System.out.printf("[%%.20f] -> %.15f%n", Math.PI);


        System.out.println("Группировка символов с учетом разделителей, указанных в локали (%,d   %,f)");
        System.out.printf("[%%,d] -> %,d%n", 10);
        System.out.printf("[%%,d] -> %,d%n", 100000000000000L);
        System.out.printf("[%%,f] -> %,f%n", 12345678901234567890.98765432109876543210d);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Выравнивание чисел по правой стороне: (%5d %5d %5d)");
        System.out.printf("%5d %5d %5d%n", 1, 2, 3);
        System.out.printf("%5d %5d %5d%n", 41, 51, 61);
        System.out.printf("%5d %5d %5d%n", 712, 812, 912);
        System.out.println("Выравнивание чисел по левой стороне: (%-5d %-5d %-5d)");
        System.out.printf("%-5d %-5d %-5d%n", 1, 2, 3);
        System.out.printf("%-5d %-5d %-5d%n", 41, 51, 61);
        System.out.printf("%-5d %-5d %-5d%n", 712, 812, 912);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------");
        System.out.println("Числа комплексно:");
        System.out.println("-----------");
        System.out.println();
        System.out.println("Печать до третьего знака после запятой + фиксированная длина: (например, %10.3f)");
        System.out.printf("[%%10.3f] -> %10.3f%n", 23.4567);
        System.out.printf("[%%10.3f] -> %10.3f%n", 124343.445);
        System.out.printf("[%%10.3f] -> %10.3f%n", Math.PI);
        System.out.println("Печать до третьего знака после запятой + фиксированная длина + ведущие нулм: (например, %010.3f)");
        System.out.printf("[%%010.3f] -> %010.3f%n", 23.4567);
        System.out.printf("[%%010.3f] -> %010.3f%n", 124343.445);
        System.out.printf("[%%010.3f] -> %010.3f%n", Math.PI);
        System.out.println("Печать до третьего знака после запятой + фиксированная длина " +
                "+ ведущие нулм + обязательный знак числа: (например, %+011.3f)");
        System.out.printf("[%%+011.3f] -> %+011.3f%n", 23.4567);
        System.out.printf("[%%+011.3f] -> %+011.3f%n", 124343.445);
        System.out.printf("[%%+011.3f] -> %+011.3f%n", -124343.445);
        System.out.printf("[%%+011.3f] -> %+011.3f%n", Math.PI);
        System.out.println("Печать до третьего знака после запятой + фиксированная длина " +
                "+ обязательный знак числа + разделители: (например, %+,11.3f)");
        System.out.printf("[%%+,20.3f] -> [%+,20.3f]%n", 23.4567);
        System.out.printf("[%%+,20.3f] -> [%+,20.3f]%n", -124343.445);
        System.out.printf("[%%+,20.3f] -> [%+,20.3f]%n", 100924343.445);
        System.out.printf("[%%+,20.3f] -> [%+,20.3f]%n", Math.PI);
        System.out.printf("[%%+-,20.3f] -> [%+-,20.3f]%n", 23.4567);
        System.out.printf("[%%+-,20.3f] -> [%+-,20.3f]%n", -124343.445);
        System.out.printf("[%%+-,20.3f] -> [%+-,20.3f]%n", 100924343.445);
        System.out.printf("[%%+-,20.3f] -> [%+-,20.3f]%n", Math.PI);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------");
        System.out.println("Строки:");
        System.out.println("-----------");
        System.out.println();
        System.out.printf("[%%s] -> %s%n", "Просто строка");
        System.out.printf("[%%s] -> %s%n", null);
        System.out.printf("[%%s] -> %s%n", 5);
        System.out.printf("[%%s] -> %s%n", new Object());
        System.out.printf("[%%s] -> %s%n", new Random());
        System.out.printf("[%%s] -> %s%n", new char[]{'a', 'b', 'c'});
        System.out.printf("[%%s] -> %s%n", new Integer(12));
        System.out.printf("[%%s] -> %s%n", new BigInteger("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"));


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------");
        System.out.println("Даты:");
        System.out.println("-----------");
        System.out.println();
        System.out.println("1$ - означает номер переменной, я использую это, чтобы не писать  три раза 'now'");
        System.out.println("Дата: 4 марта 2017, 17 часов, 2 минуты 9 секунд");
        Date now = new Date(117, 2, 4, 17, 2, 9);
        System.out.printf("[%%1$te %%1$tb of %%1$ty] -> %1$te %1$tb of %1$ty%n", now);
        System.out.printf("[%%1$te %%1$tB of %%1$ty] -> %1$te %1$tB of %1$ty%n", now);
        System.out.printf("[%%1$td.%%1$tm.%%1$tY] -> %1$td.%1$tm.%1$tY%n", now);
        System.out.printf("[%%1$tl:%%1$tM] -> %1$tl:%1$tM%n", now);
        System.out.printf("[%%1$tl:%%1$tM %%1$tp] -> %1$tl:%1$tM %1$tp%n", now);
        System.out.printf("[%%1$tI:%%1$tM %%1$tp] -> %1$tI:%1$tM %1$tp%n", now);
        System.out.printf("[%%1$tk:%%1$tM] -> %1$tk:%1$tM%n", now);
        System.out.printf("[%%1$tH:%%1$tM] -> %1$tH:%1$tM%n", now);
        System.out.printf("[%%1$tD] -> %1$tD%n", now);
        System.out.printf("[%%1$tR] -> %1$tR%n", now);
        System.out.printf("[%%1$tT] -> %1$tT%n", now);
        System.out.printf("[%%1$tr] -> %1$tr%n", now);
        System.out.printf("[%%1$tF] -> %1$tF%n", now);
        System.out.printf("[%%1$tc] -> %1$tc%n", now);
    }
}
