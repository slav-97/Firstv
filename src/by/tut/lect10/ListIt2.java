package by.tut.lect10;

import java.util.*;

//Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.

public class ListIt2 {
    public static void main(String[] args) {
        int element = 5;
        ArrayList<Integer> states = new ArrayList<Integer>();
        for (int i = 0; i < element; i++){
            int a = (int)(Math.random() * 10 + 1);
            Integer b = new Integer(a);
            states.add(i, b);
        }
        Integer i = Collections.max(states);
        System.out.println("Max = " +i);
        System.out.println();
        Iterator<Integer> iter = states.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
