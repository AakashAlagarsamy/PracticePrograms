import java.util.Scanner;
import java.lang.Math.*;

public class SquareFree {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a[] = new int[n];
        int k=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                a[k]=i;
                k++;
            }
        }
        int c=0;
        for(int i=0;i<k;i++)
        {
            if(!isPerfectSquare(a[i]))
            {
                System.out.println(a[i]);
                c++;
            }
        }
        System.out.println(c);
    }
    public static boolean isPerfectSquare(int x)
    {
        // Find floating point value of
        // square root of x.
        double sr = Math.sqrt(x);

        // If square root is an integer
        return ((sr - Math.floor(sr)) == 0);
    }
}
