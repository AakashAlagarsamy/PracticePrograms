import java.util.Scanner;

public class BookTurnPage {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int p = S.nextInt();
        int c=0,d=0;
            for (int i = n-1; i > p; i = i - 2)
            {
                c++;
            }
            for (int i = 1; i < p; i = i + 2)
            {
                d++;
            }
        if(c>d)
        {
            System.out.println(d);
        }
        else
        {
            System.out.println(c);
        }

    }
}
