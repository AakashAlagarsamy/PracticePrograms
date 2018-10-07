import java.util.Arrays;
import java.util.Scanner;

public class IncreasingShots {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a[] = new int[n];
        int c = 0, k = 0, max=0;
        for (int i = 0; i < n; i++) {
            a[i] = S.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                c++;
            } else {
                c = 0;
            }
            if(c>max) {
                max = c;
            }
        }
        System.out.print(max);
    }
}


/*
 * 20
 * 0 1 0 0 1 2 1 2 3 4 3 2 3 4 5 6 7 8 7 6
 */
