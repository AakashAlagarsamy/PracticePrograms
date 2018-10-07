import java.util.Scanner;

public class RobotStartEnd {
    public static int Way(int cr,int cc,int m,int n)
    {
        if(cc>n-1||cr>m-1)
            return 0;
        else if(cr==m-1&&cc==n-1)
            return 1;
        return Way(cr,cc+1,m,n)+Way(cr+1,cc,m,n);
    }
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.print(Way(S.nextInt(),S.nextInt(),S.nextInt(),S.nextInt()));
    }
}
