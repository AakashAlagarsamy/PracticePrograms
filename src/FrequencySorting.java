import java.util.*;

public class FrequencySorting {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String s1 = S.nextLine();
        String[] s2 = s1.split(" ");
        int a[] = new int[s1.length()];
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        TreeMap<Integer,Integer> treeMap =new TreeMap<>(Collections.reverseOrder());
        //Iterator<Map.Entry<Integer, Integer>> iterator = treeMap.entrySet().iterator();
        Iterator iterator = treeMap.entrySet().iterator();
        Iterator iterator1 = treeSet.iterator();
        for(int i=0;i<s2.length;i++)
        {
            a[i] = Integer.parseInt(s2[i]);
            treeSet.add(a[i]);
        }
        int c=0,aa=0;
        for(int i=0;i<s2.length;i++)
        {
            c=0;
            aa=0;
            while (iterator1.hasNext())
            {
                aa = (int)iterator.next();
                if(aa == a[i])
                {
                    c++;
                }
            }
            treeMap.put(aa,c);
        }
        System.out.println(treeMap);

    }
}


/*
*
* 6 6 6 2 2 4 4 4 5 5 5 5
* 5 5 5 5 6 6 6 4 4 4 2 2
 */