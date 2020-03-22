package by.tut.lect10;

import java.util.*;

//Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.

public class ListIt {
    public static void main(String[] args) {
        int element = 5;
        int negative = 3;
        ArrayList<Integer> mark = new ArrayList<Integer>();
        for (int i = 0; i < element; i++)
        {
            int a = (int)(Math.random() * 10 + 1);
            Integer b = new Integer(a);
            mark.add(i, b);
        }
        System.out.println(mark);
        for (int i = 0; i < mark.size(); i++)
        {
            if (mark.get(i) <= negative) {
                mark.remove(i);
                i++;
            }
        }
        System.out.println(mark);
    }
}
