package by.tut.lect3;

public class Z3_6 {
    public static void main(String[] args) {
        System.out.println(" № 6 ");
        int n=12;
        boolean f = true;
        int i;
        for(i=2; i<n ;i++)
        {
            if (n%i==0) {
                f = false;
                break;
            }
        }
        if (f) {
            System.out.println("число простое");
        }
        else {
            System.out.println("число составное ");
        }
    }
}
