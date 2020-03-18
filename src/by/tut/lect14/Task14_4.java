package by.tut.lect14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task14_4 {
    static final String stringlist[] = { "abc", "+375251539249", "def   123", "456 ghi", "+375445656565",
            "no match", "jkl789mno   789", "", "123.123",
            "1,2,3,4,5,6,7,8,9,10" };

    public static void main(String args[]) {
        Pattern patt = Pattern.compile("(\\d{3})?(\\d{2})?(\\d{7})");
        for (int i = 0; i < stringlist.length; i++) {
            String currstr = stringlist[i];
            String outstr;
            Matcher match = patt.matcher(currstr);
            boolean result = match.find();

            if (result) {
                StringBuffer strbuf = new StringBuffer();
                do {
                    match.appendReplacement(strbuf, "$1($2)$3");
                    result = match.find();
                } while (result);
                match.appendTail(strbuf);
                outstr = strbuf.toString();
            }
            else {
                outstr = currstr;
            }
            System.out.println(outstr);
        }
    }
}
