import java.util.Scanner;

public class MatrixRotation {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int m = S.nextInt();
        int n = S.nextInt();
        int r = S.nextInt();
        int[][] a= new int[m][n];
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=S.nextInt();
            }
        }
    }
}
