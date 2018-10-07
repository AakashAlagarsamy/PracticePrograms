package Hackerrank;

import java.util.Scanner;

public class LessThanKeyElement {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int k = S.nextInt();
        int a[] = new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]= S.nextInt();
            if(k>a[i]) c++;
        }
        System.out.println(c);
    }
}
