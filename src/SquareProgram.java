import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SquareProgram {
    public static int n = new Scanner(System.in).nextInt();
    public static int a[] = new int[n];
    public static ArrayList<Integer> al = new ArrayList<>();
    public static ArrayList<Integer> la = new ArrayList<>();
    public static void main(String args[])
    {
        int k=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
//                a[k]=i;
//                k++;
                al.add(i);
            }
        }
//        for (int nu:al) {
//            if(isPerfectSquare(nu))
//            {
//                //al.remove(al.indexOf(nu));
//
//            }
//        }
       // System.out.print(al);
        Iterator<Integer> it = al.iterator();
        while(it.hasNext())
        {
            int nn = it.next();
            if(!isPerfectSquare(nn))
            {
//                la.add(nn);
//                al.remove(al.indexOf(nn));
            }
        }
        for(int i=0;i<k;i++)
        {
            if(!isPerfectSquare(a[k]))
            {
               // al.add(a[k]);
            }
        }
        System.out.print(al);
    }
    public static boolean isPerfectSquare(int x)
    {
        double sr = Math.sqrt(x);
        return ((sr - Math.floor(sr)) == 0);
    }
}
