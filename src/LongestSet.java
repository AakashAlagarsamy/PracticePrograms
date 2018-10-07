import java.util.Scanner;

public class LongestSet {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] a=new int[n];
        int[] ans=new int[n];
        int c1=0,c2=0,max=0,k1,k2,k3;
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            c1 = 1;
            c2 = 1;
            k1 = a[i];
            k2 = a[i] + 1;
            k3 = a[i] - 1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] == k1 || a[j] == k2) c1++;
                if (a[j] == k1 || a[j] == k3) c2++;
            }
            if (c1 > max) max = c1;
            if (c2 > max) max = c2;
        }
        System.out.print(max);
    }
}
