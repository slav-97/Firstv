package by.tut.lect14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task14_1 {
    public static void main(String[] args) {
        String email = "vyacheslavlebedko@gmail.com";
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);

        if(mat.matches()){
            System.out.println("Valid email address");
        }
        else{
            System.out.println("Not a valid email address");
        }
    }
}
