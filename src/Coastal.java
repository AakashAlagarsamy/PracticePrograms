import java.util.Scanner;

public class Coastal {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String s1 = S.nextLine();
        String ss[] = s1.split(",");
        int r = Integer.parseInt(ss[0]);
        int c = Integer.parseInt(ss[1]);
        int bc = Integer.parseInt(ss[2]);
        int x[] = new int[bc];
        int y[] = new int[bc];
        String st[] = new String[bc];
        String tt[] = new String[2];
        int a[][] = new int[c][r];
        for(int i=0;i<bc;i++)
        {
            st[i] = S.nextLine();
            tt = st[i].split(",");
            x[i] = Integer.parseInt(tt[0]);
            y[i] = Integer.parseInt(tt[1]);
        }
//        for(int i=0;i<bc;i++)
//        {
//            System.out.println(x[i]+" "+y[i]);
//        }
        System.out.println(r+" "+c);
        for(int k=0;k<bc;k++)
        {
            a[y[k]][x[k]]=1;
        }
        for(int i=r-1;i>=0;i--)
        {
            for(int j=0;j<c;j++)
            {

                //System.out.print(""+j+""+i+" ");
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
        //System.out.print(Count(a));
    }
//    public static int Count(int a[][])
//    {
//
//    }
}

/*
3,4,2
2,0
0,2
 */