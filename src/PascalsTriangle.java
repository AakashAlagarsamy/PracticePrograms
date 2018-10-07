import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        boolean b = true;
        int num,sp,k;
        for(int i=0;i<n;i++)
        {
            b=true;
            k=1;
            for(sp=0;sp<n-i;sp++)
            {
                System.out.print(" ");
            }
            for(num=1;num<=((2*n)-(2*sp))+1;num++)
            {
                if(k==i+1)
                {
                    //System.out.print(k);
                    b = false;
                }
                if(b)
                {
                    System.out.print(k);
                    k++;
                }
                else
                {
                    System.out.print(k);
                    k--;
                }
                //System.out.print(k);
            }
//            for(sp=0;sp<n-i;sp++)
//            {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
