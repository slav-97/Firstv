package by.tut.dz2;
import java.util.Scanner;

import static java.lang.Math.max;

public class DZ2_2 {
    public static void main(String[] args) {
        //Имеются два дома размерами a на b и c на d.
        // Размеры вводятся польователем с консоли.
        // Проверить, помещаются ли эти дома на участке размерами
        // e на f.
        // Стороны домов - параллельны сторонам участка,
        // в остальном размещение может быть любым.
        System.out.println("№ 2!");
        System.out.println(" ==== задача 2 ==== ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" дом 1 a*b ");
        System.out.print("введите a:");
        int a = sc.nextInt();
        System.out.print("введите b:");
        int b = sc.nextInt();
        System.out.println(" дом 2 с*d ");
        System.out.print("введите c:");
        int c = sc.nextInt();
        System.out.print("введите d:");
        int d = sc.nextInt();
        System.out.println(" участок e*f ");
        System.out.print("введите e:");
        int e = sc.nextInt();
        System.out.print("введите f:");
        int f = sc.nextInt();
// если мы дома не переворачиваем, то существует только два варианта
        // либо рядом в линейку Дом1 и Дом2 (и тогда у них длины
        // складываются и надо только максимальную высоту найти)
        // либо друг под другом  Дом1
        //                    и Дом2 (и тогда у них высоты складываются
        // а по длине достаточно максимальной из двух.
        boolean vlineiku = (e > (a + c)) & (f > max(b, d));
        boolean drugnaddrugom = (e>max(a,c)) & (f> (b+d));
        boolean pomestitsa = vlineiku | drugnaddrugom;
        if (pomestitsa) {System.out.print(" дом 1 и дом 2 поместятся на участке ");}
        else {System.out.print(" дом 1 и дом 2 НЕ поместятся на участке ");}


    }
}
