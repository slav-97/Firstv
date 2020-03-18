package by.tut.lect14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task14_3 {
    public static void main(String args[]) {
        Pattern p = Pattern.compile("[Ph]+?");
        Matcher m = p.matcher("P<html> <head> <title>Пример 3</title> </head> <body> <H1>Стих</H1> <H2>Автор неизвестен</H2> " +
                "<P>Во глубине сибирских роз<BR> Хранится гордое терпение.<BR> Не пропадет - ваш гордый труд<BR> Взъерошенный " +
                "в неволе орел молодой.</P=l> <P>И шествуя важно, в спокойствии тишины,<BR> Мой грустный друг, махая рукой,<BR> В больших сапогах, в " +
                "полубелом пальто,<BR> Здоровую пищу ест под окном.</P id=> </body> </html> ");
        System.out.println(m.replaceAll("<p>" ));
    }
}
