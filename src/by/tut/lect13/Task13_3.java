package by.tut.lect13;

public class Task13_3 {
    public static boolean func (String str, String word) {
        if (str.startsWith ("Строка")  & str.endsWith ("Строка") ){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(func("Строка начинается словом Строка", "Строка"));
    }
}
