package by.tut.z3;

public class Z3_4 {
    public static void main(String[] args) {
        long[] arr = new long[3];
        System.out.println("  ");
        System.out.println(" № 4 ");
        for (int i = 0; i < 3; i++) {
            arr[i] = Math.round(Math.random() * 100);
            System.out.print(" " + arr[i]);
        }
        System.out.println("  ");
        boolean v = true;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1]) {
                v = false;
            }
        }
        if (v) {
            System.out.println(" является строго возрастающей последовательностью ");
        } else {
            System.out.println(" не является строго возрастающей последовательностью ");
        }
    }
}
