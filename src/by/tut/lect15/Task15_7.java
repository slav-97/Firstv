package by.tut.lect15;

import java.io.*;
import java.util.Arrays;

//Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.

public class Task15_7 {
    private static final String FILE_NAME_INPUT = "C:\\File.txt";
    private static final String FILE_NAME_OUTPUT = "C:\\File2.txt";

    public static void main(String[] args) throws Exception {
        System.out.println(readFromFile(FILE_NAME_INPUT));
        String str = readFromFile(FILE_NAME_INPUT);
        char [] charArray = readFromFile(FILE_NAME_INPUT).toCharArray();
        Arrays.sort(charArray);
        writeStringToFile(FILE_NAME_OUTPUT, flip(str, 0));
        String start = readFromFile(FILE_NAME_INPUT);
        String result = "";
        char[] chars = start.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        System.out.println(result);
        String[] split = start.split("\n");

        for (int i = split.length - 1; i >= 0; i--) {
            result += split[i];
        }
        System.out.println(result);
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

    public static void writeStringToFile(String fileName, String str) throws IOException {
        FileWriter fw = new FileWriter(new File(fileName));
        String[] arrayWords = str.split("\\s+");
        for (String s : arrayWords) {
            fw.write(s + "\n");
        }
        fw.close();
    }

    public static String flip(String str, int position) {
        int length = str.length();
        if (position != length / 2) {
            char[] chars = str.toCharArray();
            char temp = chars[position];
            int flipPosition = length - 1 - position;
            chars[position] = chars[flipPosition];
            chars[flipPosition] = temp;
            return flip(new String(chars), ++position);
        } else {
            return str;
        }
    }
}
