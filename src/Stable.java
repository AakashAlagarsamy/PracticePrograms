import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Stable {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a=isStable(n);
        if(a==1)
            System.out.println("Stable");
        else
            System.out.println("Unstable");
    }

    public static int isStable(int n)
    {
        int[] d=new int[100];
        int[] sa=new int[100];
        int i=0,c,j,k,co=0;
        while (n>0)
        {
            d[i]=n%10;
            n=n/10;
            i++;
        }
        for(j=0;j<i;j++)
        {
            c=0;
            for(k=0;k<i;k++)
            {
                if(d[j]==d[k])
                {
                    c++;
                }
            }
            sa[j]=c;
        }
        co=0;
        for(int x=0;x<i;x++)
        {
            if(sa[0]==sa[x])
            {
                co++;
            }
        }
        if(co==i)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}