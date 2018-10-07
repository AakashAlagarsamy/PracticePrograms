import java.util.Scanner;

public class StaircaseWaysLong {
    static Scanner S = new Scanner(System.in);
    static long e = S.nextLong();
    static long results[]=new long[Math.toIntExact(e)];
    public static long StaircaseMemoization(long s) {
        if (s == e) return 1;
        else if (s > e) return 0;
        if (results[Math.toIntExact(s)] != -1)
            return results[Math.toIntExact(s)];
        else {
            results[Math.toIntExact(s)] = StaircaseMemoization(s + 1) + StaircaseMemoization(s + 2);
            System.out.println(s+" "+results[Math.toIntExact(s)]);
            return results[Math.toIntExact(s)];
        }
    }

    public static void main(String args[]) {

        for(long i=0;i<e;i++)
        {
            results[Math.toIntExact(i)] = -1;
        }

        System.out.println(StaircaseMemoization(0));
    }
}
