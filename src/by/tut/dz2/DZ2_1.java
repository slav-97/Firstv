package by.tut.dz2;
import java.util.Scanner;

public class DZ2_1 {
    public static void DZ1(String[] args) {

        System.out.println("№ 1!");
        System.out.println(" ==== задача 1 ==== ");
        // 1) Имеются три числа - день, месяц и год, вводимые пользователем с
        //  консоли.     Вывести дату следующего дня в формате
        //  "День.Месяц.Год".     Учесть переход на следующий месяц,
        //  а также следующий год.     Форматирование строки "День.Месяц.
        //  Год" вынести в отдельную функцию.

        Scanner sc = new Scanner(System.in);
        boolean dateiscorrect = false;
        while (!dateiscorrect) {
            System.out.print("введите день:");
            int day = sc.nextInt();
            System.out.print("введите месяц:");
            int mon = sc.nextInt();
            System.out.print("введите год:");
            int year = sc.nextInt();

            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
            // Использовать следующую информацию:
            // 1-Январь, 3-март, 5-май, 7-июль, 8-август, 9-октябрь, 12-декабрь - 31 день
            // Апрель, июнь, сентябрь, ноябрь - 30 дней
            // Февраль - 28 дней в обычный год, 29 дней в високосный
            int maxdays[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear) {
                maxdays[1] = 29;
            }
            boolean monisok = ((mon > 0) & (mon < 13));
            if (monisok) { dateiscorrect = (day <= maxdays[mon-1]);}
            if (!dateiscorrect) {
                System.out.println("такой даты не существует");
            } else {
                System.out.println("введена корректная дата:" + dateout(day, mon, year));}
            day++; if (day>maxdays[mon-1]) { day = 1; mon++;
                if (mon>12) { day = 1; mon = 1; year++; System.out.println("следующий день:" + dateout(day, mon, year));

                }   else {System.out.println("следующий день:" + dateout(day, mon, year));}

            } else {System.out.println("следующий день:" + dateout(day, mon, year));}
        } //пока вводится некоректная дата - продолжать ввод;


    } // начало описания блока функций

    static String dateout(int d, int m, int y) {
        String output1 = d + "." + m + "." + y;
        return output1;
    } // end dateout
}
