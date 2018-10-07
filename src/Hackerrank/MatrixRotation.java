package Hackerrank;

import java.util.Scanner;

public class MatrixRotation {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int r = S.nextInt();
        int c = S.nextInt();
        int f = S.nextInt();
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=S.nextInt();
            }
        }
        int b[][] = new int[r][c];
        if(f==1){
            for (int i = r - 1, i1 = 0; i >= 0; i--, i1++) {
                for (int j = 0; j < c; j++) {
                    b[i1][j] = a[j][i];
                }
            }
        }else{
            return;
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
