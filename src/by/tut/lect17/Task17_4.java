package by.tut.lect17;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//	Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.

public class Task17_4 {
    public static void main(String[] args) {
        String s = Stream.of(5, 2, 4, 2, 1)
                .map(String::valueOf)
                .collect(Collectors.joining("", "'", "'"));
        System.out.println(s);
    }
}
