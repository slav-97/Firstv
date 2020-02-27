package by.tut.dz2;
import java.util.Scanner;

public class DZ2_3 {
    public static void main(String[] args) {


        System.out.println("====  задача 3 ===");

        // Написать программу, вычисляющую корни квадратного уравнения вида
        // ax² + bx + c = 0, где a, b и c - вводимые пользователем из консоли данные.
        // Учитывать только реальные корни (в случае отрицательного дискриминанта
        // выводить сообщение пользователю).
        // При решении создать и использовать следующие вынесенные функции:
        // функция isPositive, определяющая, является ли число положительным
        //  функция isZero, определяющая, является ли число нулём
        //  функция discriminant, вычисляющая дискриминант

        Scanner sc = new Scanner(System.in);
        System.out.println("введите a:");
        int a = sc.nextInt();
        System.out.println("введите b:");
        int b = sc.nextInt();
        System.out.println("введите c:");
        int c = sc.nextInt();
        System.out.println("введено уравнение "+a+"x2+"+b+"x+"+c+"=0");
        long dis = discriminant (a,b,c);
        if (!isPositive(dis)) {
            System.out.println("дискриминант <0, уравнение не имеет корней");
        } else {
            double koren1 = (b*(-1)+Math.sqrt(dis))/(2*a);
            double koren2 = (b*(-1)-Math.sqrt(dis))/(2*a);
            System.out.println("дискриминант >0, уравнение имеет 2 корня:");
            System.out.println("х1=:"+koren1);
            System.out.println("х2=:"+koren2);
        } // если дискриминант позитивный - значит, есть два корня, и мы вычисляем второй
        if (isZero(dis)) {
            double koren1 = (b*(-1)+Math.sqrt(dis))/(2*a);
            System.out.println("дискриминант =0, уравнение имеет 1 корень:");
            System.out.println("х1=:"+koren1);
        } // если дискриминант равен нулю, то у него оба корня совпадают, вычисляем какой-нибудь один


    } // end of main
    static boolean isPositive(long p) {
        return (p>0);
    } // end isPositive

    static boolean isZero(long q) {
        return (q==0);
    }// end isZero

    static long discriminant (int a, int b, int c) {
        return (b*b-4*a*c);
    }// end discriminant
} //end of project

