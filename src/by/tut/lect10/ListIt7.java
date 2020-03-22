package by.tut.lect10;

import java.util.*;

//	Использовать Алгоритмы. Не используя вспомогательных объектов, переставить отрицательные элементы сгенерированного списка в конец, а положительные – в начало этого списка.

public class ListIt7 {
    private static final int COUNT_NUM = 15;
    private static List<Integer> list = new ArrayList<>(COUNT_NUM);

    private static void enterList() {
        Random random = new Random(System.currentTimeMillis());

        for(int i = 0; i < COUNT_NUM; i++)
        {
            int number = -1*COUNT_NUM + random.nextInt(COUNT_NUM * 2);
            list.add(number);
        }
    }

    private static void printList() {
        for (Integer aList : list) {
            System.out.print(aList + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enterList();
        printList();

        int highLimInd = list.size();

        for (int i = 0; i < highLimInd; i++) {
            if (list.get(i) >= 0)
                list.add(list.get(i));
        }
        for (int i = 0; i < highLimInd; i++) {
            if (list.get(i) < 0)
                list.add(list.get(i));
        }

        for (int i = 0; i < highLimInd; i++) {
            list.remove(0);
        }
        printList();

        System.out.println();
    }
}
