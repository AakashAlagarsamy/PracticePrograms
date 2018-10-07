import java.util.Scanner;

public class BookFairMemoization {
    public static Scanner S = new Scanner(System.in);
    static String ss = S.next();
    static String s[] = ss.split(",");
    static int n = Integer.parseInt(s[0]);
    static int a[] = new int[n];
    static int k = Integer.parseInt(s[1]);
    static int res[] = new int[n];
    public static void main(String args[])
    {
        for(int i=0;i<n;i++)
        {
            res[i] = -1;
            a[i] = S.nextInt();
        }
        System.out.print(Coupons(0));
    }

    public static int Coupons(int i)
    {
        if(i>=n)
            return 0;
        if(res[i]!=-1)
            return res[i];
        int yes = a[i]+Coupons(i+k+1);
        int no = Coupons(i+1);
        res[i]=yes>no?yes:no;
        return res[i];
    }
}

/*
10,2
4 5 8 7 5 4 3 4 6 5

19

10,2
50 70 40 50 90 70 60 40 70 50

230
*/