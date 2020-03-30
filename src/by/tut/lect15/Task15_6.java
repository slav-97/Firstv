package by.tut.lect15;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
// Для этого использовать рекурсию

public class Task15_6 {
    private static List<File> files = new ArrayList<>();

    public static void main(String[] args) {
        getSubFiles(files, new File("File1.txt"));
        for (Object file : files.toArray()) {
            System.out.println(((File) file).getAbsolutePath());
        }
    }

    private static void getSubFiles(List<File> source, File parent) {
        if (!source.contains(parent)) {
            source.add(parent);
        }
        File[] listFiles = parent.listFiles();
        if(listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (file.isDirectory()) {
                getSubFiles(source, file);
            } else {
                if (!source.contains(file)) {
                    source.add(file);
                }
            }
        }
    }
}
