package by.tut.dz2;

import java.util.Scanner;

public class DZ2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Дом1");
        System.out.println("Введите сторону а");
        int a=sc.nextInt();
        System.out.println("Введите сторону b");
        int b=sc.nextInt();
        System.out.println("Дом2");
        System.out.println("Введите сторону c");
        int c=sc.nextInt();
        System.out.println("Введите сторону d");
        int d=sc.nextInt();
        System.out.println("Размер участка");
        System.out.println("Введите сторону e");
        int e=sc.nextInt();
        System.out.println("Введите сторону f");
        int f=sc.nextInt();

        if(a*b+c*d<=e*f==true)
        {
            System.out.println("Помещаются");
        }
        else
        {
            System.out.println("Не помещаются");
        }

    }
}
