package ru.levelp.examples.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\test.xml");
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.length() = " + file.length());

        File dir = new File("C:\\Shape\\Circle\\C");
        System.out.println("dir.mkdirs() = " + dir.mkdirs());
        // C:\Shape\Circle\C
        System.out.println("dir.delete() = " + dir.delete());
        // C:\Shape\Circle
        System.out.println("dir.getCanonicalPath() = " + dir.getCanonicalPath());
        dir.getParentFile().delete();
        dir.getParentFile().getParentFile().delete();
        // C:\Shape
        // . - текущий каталог
        // .. - вышестоящий каталог
        //System.out.println("dir.mkdirs() = " + dir.mkdirs());

        // Читаем все строки из файла
        List<String> lines = Files.readAllLines(
                Paths.get("C:\\test.xml"));
        for (String line : lines) {
            System.out.println(line);
        }

    }
}
