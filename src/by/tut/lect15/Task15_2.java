package by.tut.lect15;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.

public class Task15_2 {
    private static final String FILE_NAME_INPUT = "File1.txt";
    public static void main(String[] args) throws Exception {
        System.out.println(readFromFile(FILE_NAME_INPUT));
        System.out.println();
        String start = readFromFile(FILE_NAME_INPUT);
        String[] wordArray = start.split("[\\s,.:!?]+");
        Pattern pattern = Pattern.compile("^[EeYyUuIiOoAa].*$");
        for (String word : wordArray) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word);
            }
        }
    }

    public static String readFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String str = null;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            String[] arrayWords = str.split("\\s+");
            for (String s : arrayWords) {
                sb.append(s + "\n");
            }
        }
        return sb.toString();
    }
}
