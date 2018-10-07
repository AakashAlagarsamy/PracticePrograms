import java.util.Scanner;

public class Power {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.print(PowerOfNum(S.nextInt(),S.nextInt()));	    // 0.10s 29312KB
        System.out.print(PowerOfNumber(S.nextInt(),S.nextInt()));	// 0.12s 29216KB
        System.out.print((int)Math.pow(S.nextInt(),S.nextInt()));	// 0.12s 29160KB
    }

    private static int PowerOfNumber(int a, int n) {
        if(n==0)
            return 1;
        if(n%2==0)
            return PowerOfNumber((a*a),(n/2));
        else
            return a*PowerOfNumber(a,n-1);
    }

    private static int PowerOfNum(int a, int n) {
        if(n==0)
            return 1;
        return a*PowerOfNum(a,n-1);
    }
}
