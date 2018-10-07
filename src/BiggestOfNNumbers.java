import java.util.Scanner;

public class BiggestOfNNumbers {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String s = S.nextLine();
        String s1[] = s.split(" ");
        int max = -1000000;
        int smax=0;
        int a[] = new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            a[i] = Integer.parseInt(s1[i]);
            if(a[i]>max)
            {
                smax=max;
                max = a[i];
            }
            if(a[i]>smax&&smax!=max)
            {
                smax = a[i];
            }
        }
        System.out.print(max);
        System.out.print(smax);
    }
}