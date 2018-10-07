import java.util.Arrays;
import java.util.Scanner;

public class Sortedboxes {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int p = S.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = S.nextInt();
            b[i] = a[i];
        }
        int W = 0;
        Arrays.sort(b);
        int heavy = b[n - 1];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1] && a[j] != heavy && a[j+1]!=heavy)
                    //if ((a[j] > a[j + 1] && j!=p-1 ) || (a[p]!=heavy))
                {
                    // swap temp and arr[i]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    System.out.println(a[j] + " " + a[j + 1]);
                    W = W + a[j + 1] * a[j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print(W);
    }
}


/*
5 2
20 50 30 80 70
 */