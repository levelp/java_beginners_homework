package ru.levelp.examples.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SaveLoad {
    public static void main(String[] args) throws IOException {
        // Из программы на Java
        // Создать папку YourFolderName
        // И текстовый файл about_me.txt внутри
        // С одним предложением о ваших
        // достижениях (какие вы замечательные)
        String fileName = "test.txt";
        List<String> lines =
                Files.readAllLines(Paths.get(fileName));

        // Работа с каталогом
        File dir = new File("C:\\YourFolderName");
        File file = new File(dir, "about_me.txt");
        dir.mkdirs();
        file.createNewFile();

        //PrintWriter writer


        ///MyClass myClass = new MyClass();
        //save(myClass, "my.txt");

    }
}
