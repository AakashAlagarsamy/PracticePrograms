import java.util.Scanner;

public class NumberSubstring {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int s1 = S.nextInt();
        int s2 = S.nextInt();
        int s3=s2;
        int c = 0,co=0,r;
        while(s3>0)
        {
            s3=s3/10;
            c++;
        }
        while(s1>0)
        {
            r = s1 % (int)Math.pow((double)10,(double)c);
            s1 = s1 / (int)Math.pow((double)10,(double)c);
            if(r==s2)
            {
                co++;
            }
        }
        System.out.print(co);
    }

}
