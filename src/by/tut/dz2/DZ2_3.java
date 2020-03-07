package by.tut.dz2;

import java.util.Scanner;

public class DZ2_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();
        discriminant(a,b,c);
    }
    private static double discriminant(int a, int b, int c)
    {
        int d=b*b-4*a*c;
        if(!isPositive(d) && d!=0)
        {
            System.out.println("Дискриминант отрицательный");
            System.out.println(d);
        }
        else if (isZero(d))
        {
            double x=(-b+Math.sqrt(d))/2*a;
            System.out.println("Дискриминант равен нулю");
            System.out.println("Единственный корень уравнения равен  "+ x);
        }
        else
        {
            System.out.println("Дискриминант положительный");
            double x1=(-b+Math.sqrt(d))/(2*a);
            double x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Первый корень ="+x1 + "   Второй корень= "+ x2);
        }
        return d;
    }

    private static boolean isPositive(int d)
    {
        if(d>0) return true;
        else return false;
    }

    private static boolean isZero(int d)
    {
        if(d==0) return true;
        else return false;
    }
}

