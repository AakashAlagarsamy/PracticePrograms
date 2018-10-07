import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class WafforArraySortAndMerge {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        String s1 = S.next();
        String s2 = S.next();
        String a[] = s1.split(",");
        String b[] = s2.split(",");
        int aa[]=new int[a.length];
        int bb[]=new int[b.length];
        for(int i=0;i<a.length;i++)
        {
            treeSet.add(Integer.parseInt(a[i]));
        }
        for(int i=0;i<b.length;i++)
        {
            treeSet.add(Integer.parseInt(b[i]));
        }
        //System.out.print(treeSet);
        Iterator<Integer> i = treeSet.iterator();
        while (i.hasNext())
        {
            System.out.print(i.next()+",");
        }
    }
}
