import java.util.Scanner;

public class SqFree {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a[] = new int[n];
        int cc=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                a[cc]=i;
                cc++;
            }
        }
        int c=0;
        int cou=0;
        int ccc=0;
        int j[] = new int[n];
        for(int k=1;j[k]<n;k++) {
            j[k] = k * k;
            ccc++;
        }
        for(int i=0;i<cc;i++)
        {
            for(int l=0;l<ccc;l++) {
                if ((!isPerfectSquare(a[i])) && (a[i] % j[l] != 0)) {
                    cou++;
                }
            }
        }



        System.out.println(cou);
    }
    public static boolean isPerfectSquare(int x)
    {
        double sr = Math.sqrt(x);
        return ((sr - Math.floor(sr)) == 0);
    }
}
