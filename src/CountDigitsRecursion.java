import java.util.Scanner;

public class CountDigitsRecursion {
    public static int Feelings(int n)
    {
        if(n==0)
            return 0;
        else
            return (1+Feelings(n/10));
    }
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        if(n==0)
            System.out.print("1");
        else
            System.out.print(Feelings(n));
    }
}
