package by.tut.lect17;

import java.util.Arrays;

//	Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.

public class Task17_1 {
    public static void main(String[] args) {
        Integer result = Arrays.asList(5, 1, 10, 3, 4, 5, 6, 15, 25)
                .stream()
                .filter(element -> element % 2 != 0)
                .filter(element -> element % 5 == 0)
                .mapToInt(element -> element)
                .sum();
        System.out.println(result);
    }
}

