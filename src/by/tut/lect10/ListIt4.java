package by.tut.lect10;

import java.util.Scanner;
import java.util.Stack;

//	Ввести с консоли число, занести его цифры в стек.Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
//•	Задать размер стека.
//•	Внести цифру в стек.
//•	Извлечь цифру из стека.

public class ListIt4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите количество элементов");
        int num = scanner.nextInt();
        System.out.println("введите элементы");

        Stack stack = new Stack();
        for (int i = 0; i < num; i++)
            stack.push(scanner.nextInt());

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
