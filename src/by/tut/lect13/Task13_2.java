package by.tut.lect13;

public class Task13_2 {
    public static void main(String[] args) {
        String Str = new String(":(:(:(:(:(");
        System.out.print("Return Value " );
        System.out.println(Str.replace(')', ')'));
        System.out.print("Return Value " );
        System.out.println(Str.replace('(', ')'));
    }
}
