import java.util.Scanner;

public class XorXValue {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a[] = new int[n];
        int ss = S.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i] = S.nextInt();
            ss = ss ^ a[i];
        }
        System.out.print(ss);
    }
}



/*
3
3 1 5
4

3
*/


