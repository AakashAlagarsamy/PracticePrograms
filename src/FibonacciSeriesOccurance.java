import java.util.Scanner;
import java.util.TreeSet;

public class FibonacciSeriesOccurance {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        int v = 1000, t1 = 0, t2 = 1;
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 1; i <= v; ++i)
        {
            ts.add(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        //System.out.print(ts);
        for(int i=0;i<n;i++)
        {
            if(ts.contains(a[i]))
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
