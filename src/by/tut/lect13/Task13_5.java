package by.tut.lect13;

import java.util.Scanner;

public class Task13_5 {
    public static void main(String[] args) {
        int countWord = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] array = sc.nextLine().split(" +");
            countWord = countWord + array.length;
            break;
        }
        System.out.println("Количество слов = " + countWord);
    }
}
