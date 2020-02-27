package by.tut.z3;

public class Z3_5 {
    public static void main(String[] args) {
        int[][] mas1 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] mas2 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(" № 5 ");
        boolean equals = TwoDequals(mas1,mas2);
        if (equals) {
            System.out.println("массивы совпадают");
        } else {
            System.out.println("массивы не совпадают");
        }
    }
    private static boolean TwoDequals (int m1[][], int m2[][]) {
        boolean eq = true;
        int i = 0;
        int j = 0;
        if ((m1.length != m2.length)&(m1[0].length!=m2[0].length)) {
            eq = false;
        } else {
            while ((eq)&(i <m1.length)) {
                while ((eq)&(j<m1[0].length)) {
                    if (m1[i][j]!=m2[i][j]) {
                        eq=false;
                    }
                    j++;
                }
                i++;
            }
        }
        return eq;
    }
}
