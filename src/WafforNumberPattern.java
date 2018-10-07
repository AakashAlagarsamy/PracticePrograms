import java.util.Scanner;

public class WafforNumberPattern {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum++;
            int k = 1;
            boolean at = true;
            int temp = sum;
            for (int j = 0; j < n; j++)
            {
                if (i == j)
                {
                    at = false;
                }
                if (at)
                {
                    System.out.print(temp + " ");
                    temp--;
                }
                else
                {
                    System.out.print(k + " ");
                    k++;
                }
            }
            System.out.println(" ");
        }
    }
}