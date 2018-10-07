import java.util.Scanner;

public class Knapsack {
    static Scanner S = new Scanner(System.in);
    static int n = Integer.parseInt(S.nextLine());
    private static String va = S.nextLine();
    private static String we = S.nextLine();
    private static int W = S.nextInt();
    private static String val[] = va.split(" ");
    private static String wei[] = we.split(" ");
    private static int v[] = new int[val.length];
    private static int w[] = new int[wei.length];
    public static void main(String args[])
    {
//        Scanner S = new Scanner(System.in);
//        int n = S.nextInt();
//        S.nextLine();
//        String va = S.nextLine();
//        String we = S.nextLine();
//        int W = S.nextInt();
//        String val[] = va.split(" ");
//        String wei[] = we.split(" ");
//        int v[] = new int[val.length];
//        int w[] = new int[wei.length];
        for(int i=0;i<val.length;i++)
        {
            v[i] = Integer.parseInt(val[i]);
            w[i] = Integer.parseInt(wei[i]);
        }
        System.out.print(StealValueForWeight(0,0));
        //System.out.print(StealValueForWeight(v,w,0,n,W,0));
    }

    private static int StealValueForWeight(int cur,int we){
        int yes=0,no;
        if(cur>=n)
            return 0;
        if(we+w[cur]<=W)
        {
            we += w[cur];
            yes = v[cur]+StealValueForWeight(cur+1,we);
        }
        no = StealValueForWeight(cur+1,we-w[cur]);
        return Math.max(yes,no);
    }
//    public static int StealValueForWeight(int v[],int w[], int cur,int n,int W,int we){
//        int yes=0,no;
//        if(cur>=n)
//            return 0;
//        if(we+w[cur]<=W)
//        {
//            we += w[cur];
//            yes = v[cur]+StealValueForWeight(v,w,cur+1,n,W,we);
//        }
//        no = StealValueForWeight(v,w,cur+1,n,W,we-w[cur]);
//        return Math.max(yes,no);
//    }
}

/*
3
60 100 120
10 20 30
50

220
 */