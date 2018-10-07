import java.util.Scanner;

public class PasswordStableUnstable {

    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int input1 = S.nextInt();
        int input2 = S.nextInt();
        int input3 = S.nextInt();
        int input4 = S.nextInt();
        int input5 = S.nextInt();
        int x = findPassword(input1,input2,input3,input4,input5);
        System.out.println(x);
    }

    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int a[]=new int[5];
        a[0]=input1;
        a[1]=input2;
        a[2]=input3;
        a[3]=input4;
        a[4]=input5;
        int stable=0,unstable=0,fin;
        for (int i=0;i<5;i++)
        {
            if(isStable(a[i]))
            {
                stable = stable + a[i];
            }
            else
            {
                unstable = unstable + a[i];
            }
        }
        fin = stable - unstable;

        return fin;
    }

    public static boolean isStable(int n)
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
            return true;
        }
        else
        {
            return false;
        }
    }
}


