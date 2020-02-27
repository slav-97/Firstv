package by.tut.z3;

import java.util.Scanner;

public class Z3_7 {
    public static void main(String[] args) {
        System.out.println(" № 7 ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial of it");

        int factor = 1;
        int number = input.nextInt();
        for (int i=1; i<=number; i++) {
            factor = factor*i;
        }
        System.out.println("Factorial = " + factor);
        while (number > 0)
        {
            factor = factor * number;
            number--;
        }
        System.out.println("Factorial = " + factor);
    }
}
