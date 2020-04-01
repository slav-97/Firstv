package by.tut.lect16;

import java.io.*;

//	Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого и не буфиризированого символьного ввода вывода.

public class Bufer {
    public static void main(String[] args) {
        try {
            File file = new File("Filetxt.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Время выполнения: " +System.nanoTime());
    }
}

class Main22 {
    public static void main(String[] args) throws IOException {
        try {
            InputStream input = new FileInputStream("Filetxt.txt");
            int size = input.available();
            for (int i = 0; i < size; i++) {
                System.out.print((char) input.read() + " ");
            }
            input.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
        System.out.println("Время выполнения: " +System.nanoTime());

    }
}
