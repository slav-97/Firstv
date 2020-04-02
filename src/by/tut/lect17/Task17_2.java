package by.tut.lect17;

import java.util.Arrays;
import java.util.List;

//	Дан список строк. Найти количество уникальных строк длиной более 8 символов.

public class Task17_2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abcd", "aabb", "abcd", "ackl","12345678","123456789");
        long count = stringList
                .stream ()
                .filter(s -> s.length()>8)
                .distinct()
                .count();
        System.out.println(count);
    }
}
