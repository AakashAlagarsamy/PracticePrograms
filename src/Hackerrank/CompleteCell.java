package Hackerrank;

import java.util.*;

public class CompleteCell {


    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        b[0] = 0;
        b[9] = 0;
        int i;
        a[0] = 0;
        a[9] = 0;
        for (i = 1; i < 9; i++)
            a[i] = S.nextInt();
        int days = S.nextInt();
        for (int j = 0; j < days; j++) {
            for (i = 1; i < 9; i++) {
                if (a[i - 1] == 0 && a[i + 1] == 0 || a[i - 1] == 1 && a[i + 1] == 1)
                    b[i] = 0;
                else
                    b[i] = 1;
            }
            for (i = 1; i < 9; i++)
                a[i] = b[i];
        }
        for (i = 1; i < 9; i++)
            System.out.print(b[i] + " ");
    }
}
