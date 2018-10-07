package Hackerrank;

import java.util.Scanner;

public class Pattern {
    public static void main(String args[])
    {
        CreatePattern(new Scanner(System.in).nextInt());
    }

    private static void CreatePattern(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
5
    *
   ***
  *****
 *******
*********


 */