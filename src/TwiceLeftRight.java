import java.util.Scanner;

public class TwiceLeftRight {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String st = S.nextLine();
        String s[] = st.split(" ");
        int a[] = new int[s.length];
        int c=0;
        for(int i=0;i<s.length;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        for(int i=1;i<s.length-1;i++)
        {
            //System.out.print(a[i]+" ");
            if(a[i-1]==2*a[i+1])
            {
                //System.out.println(a[i]);
                c++;
            }
        }
        System.out.println(c);
    }
}


/*
10 20 5 40 15 -2 -30 -1 60
2
at 20, -30


5 90 10 2 5 -4 10 6 5 3
3
2,6,5
 */