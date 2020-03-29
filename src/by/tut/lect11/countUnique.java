package by.tut.lect11;

import java.util.*;

//Написать метод countUnique, который принимает целочисленный список в качестве параметра и возвращает количество уникальных целых чисел в этом списке.

public class countUnique {
    public static void main(String[] args) {
        int[] array = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11, 3};
        System.out.println(array.length);

        Set<Integer> mySet = new HashSet<>();
        for (int x : array) {
            mySet.add(x);
        }
        System.out.println(mySet.size());
    }
}
