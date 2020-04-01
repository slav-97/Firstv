package by.tut.lect3;

public class Z3_2 {
    public static void main(String[] args) {
        System.out.println(" № 2 ");
        int[] mas = new int[100];
        int count = 0;
        int chislo = 0;
        while (count < 100) {
            chislo++;
            if ((chislo % 13 == 0) | (chislo % 17 == 0)) {
                mas[count] = chislo;
                count++;
            }
        }
        for (int i = 0; i < mas.length - 1; i++) {
            System.out.println(count + ":  " + mas[i]);
        }
    }
}
