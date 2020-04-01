package by.tut.lect3;

public class Z3_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 3, 4, 5, 6, 9, 10};
        System.out.println(" № 1 ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("  " + arr[i]);
        }
        System.out.println("  ");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print("  " + arr[i]);
        }
        System.out.println("  ");
    }
    }
