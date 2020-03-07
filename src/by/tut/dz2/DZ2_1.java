package by.tut.dz2;

import java.util.Scanner;

public class DZ2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите день");
        int day=sc.nextInt();
        System.out.println("Введите месяц");
        int month=sc.nextInt();
        System.out.println("Введите год");
        int year=sc.nextInt();
        nextday(day,month,year);

    }

    private static void format(int day, int month, int year)
    {
        System.out.println(day+"."+month+"."+year);
    }
    private static void nextday(int day, int month, int year)
    {
        if(day==31 && (month==1|month==3|month==5| month==7|month==8|month==10))
        {
            month++;
            day=1;
        }
        else  if(day==30 && (month==4|month==6|month==9|month==11))
        {
            month++;
            day=1;
        }
        else if(day==31 && month==12)
        {
            month=1;
            day=1;
            year++;
        }
        else if(day==28 && month==2)
        {
            day=1;
            month++;
        }
        else
        {
            day++;
        }
        format(day, month, year);
    }
}
