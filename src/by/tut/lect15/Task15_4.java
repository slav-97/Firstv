package by.tut.lect15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

//Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.

public class Task15_4 {
    private static final String FILE_NAME_INPUT = "File2.txt";
    static String str;
    static {
        try {
            str = readFromFile(FILE_NAME_INPUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static char[] chars = str.toCharArray();
    static ArrayList listOfChars = new ArrayList();

    public Task15_4() throws IOException {
    }

    static int countSameLetter ( char ch){
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((chars[i] == ch) && (ch == chars[i + 1])) count++;
        }
        return count;
    }


    public static void main (String[]args){
        listOfChars.add(chars[0]);
        for (int i = 1; i < str.length(); i++) {
            if (!listOfChars.contains(chars[i])) listOfChars.add(chars[i]);
        }
        System.out.println("строка '" + str + "' состоит из букв: " + listOfChars);
        Iterator it = listOfChars.iterator();
        while (it.hasNext())
        {
            char c = (char) it.next();
            System.out.println("одинаковых пар из буквы '" + c + "' встречается " + countSameLetter(c));
        }
    }

    public static String readFromFile (String fileName) throws IOException {
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
