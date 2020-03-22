package by.tut.lect10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//	Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.

public class ListIt5 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        Set<Integer> union = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
        Set<Integer> intersect = set1.stream().filter(set2::contains).collect(Collectors.toSet());
        System.out.println(union + " - " + intersect);
    }
}
