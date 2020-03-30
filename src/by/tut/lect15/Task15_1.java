package by.tut.lect15;

import java.io.*;

//Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.

public class Task15_1 {
    public static void main(String[] args) throws IOException {
        File f = new File("File.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null)
            System.out.println(line);
    }
}
