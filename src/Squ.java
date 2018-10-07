/*import java.util.Scanner;

public class Squ {
    public static int n = new Scanner(System.in).nextInt();
    public static int a[] = new int[n];
    public static void main(String args[])
    {
     int k=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0 && Sq(i)==1)
            {
                //a[k]=i;
                k++;
            }
        }
//        for(int i=0;i<k;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
        System.out.print(k);
    }

    private static int Sq(int n) {
        for(int i=2;i<=n/2;i++)
        {
            if(i*i%n==0)
                return 0;
        }
        return 1;
    }
}*/

import java.util.Scanner;
public class Squ {
    public static long n = new Scanner(System.in).nextLong();
    public static long a[] = new long[(int) n];
    public static void main(String args[])
    {
        long k=0;
        for(long i=2;i<n;i++)
        {
            if(n%i==0 && Sq(i)==1)
            {
                k++;
            }
        }
        System.out.print(k);
    }
    private static long Sq(long n) {
        for(long i=2;i<=n/2;i++)
        {
            if(i*i%n==0)
                return 0;
        }
        return 1;
    }
}
