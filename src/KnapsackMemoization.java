import java.util.Scanner;

public class KnapsackMemoization {
    static Scanner S = new Scanner(System.in);
    static int n = Integer.parseInt(S.nextLine());
    private static String va = S.nextLine();
    private static String we = S.nextLine();
    private static int W = S.nextInt();
    private static String val[] = va.split(" ");
    private static String wei[] = we.split(" ");
    private static int v[] = new int[val.length];
    private static int w[] = new int[wei.length];
    private static int res[] = new int[n];
    public static void main(String args[])
    {
        for(int i=0;i<val.length;i++)
        {
            res[i] = -1;
            v[i] = Integer.parseInt(val[i]);
            w[i] = Integer.parseInt(wei[i]);
        }
        System.out.print(StealValueForWeight(0,0));
    }

    private static int StealValueForWeight(int cur,int we){
        int yes=0,no;
        if(cur>=n)
            return 0;
        if(res[cur]!=-1)
            return res[cur];
        if(we+w[cur]<=W)
        {
            we += w[cur];
            yes = v[cur]+StealValueForWeight(cur+1,we);
        }
        no = StealValueForWeight(cur+1,we-w[cur]);
        res[cur] = Math.max(yes,no);
        return res[cur];
    }
}

/*
3
60 100 120
10 20 30
50

220
 */