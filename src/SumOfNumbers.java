import java.util.Scanner;

public class SumOfNumbers {
    public static int Sum(int n)
    {
        if(n==1||n==0)
            return n;
        else
            return (n+Sum(n-1));
    }
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.print(Sum(S.nextInt()));
    }
}
