import java.util.Scanner;

public class BookFair {
    public static Scanner S = new Scanner(System.in);
    static String ss = S.next();
    static String s[] = ss.split(",");
    static int n = Integer.parseInt(s[0]);
    static int a[] = new int[n];
    static int k = Integer.parseInt(s[1]);
    public static void main(String args[])
    {
        for(int i=0;i<n;i++)
        {
            a[i] = S.nextInt();
        }
        System.out.print(Coupons(0));
    }

    public static int Coupons(int i)
    {
        if(i>=n)
            return 0;
        int yes = a[i]+Coupons(i+k+1);
        int no = Coupons(i+1);
        return yes>no?yes:no;
    }
}

/*
10
4 5 8 7 5 4 3 4 6 5
2

10
50 70 40 50 90 70 60 40 70 50
2
*/