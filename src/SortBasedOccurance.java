import java.util.*;

public class SortBasedOccurance {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String st = S.next();
        String[] str = st.split("");
        //System.out.println(str.length);
        int a[] = new int[st.length()];
        int c=0;
        TreeSet<Integer> ts = new TreeSet<>();
        int num;
        for(int j=0;j<str.length;j++)
        {
            ts.add(Integer.parseInt(str[j]));
            a[j]=Integer.parseInt(str[j]);
            //System.out.println(a[j]);
        }
        //System.out.print(ts);
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext())
        {
            num = it.next();
            c=0;
            for(int j=0;j<str.length;j++)
            {
                if(num==a[j])
                {
                    c++;
                }
            }
            System.out.println(num+":"+c);
        }
    }
}




/*
*  ip 4443338993
*  op 3333444998
*
*  ip 95559998228
*  op 99995552288
*
*  ip 95854335984
*  op 55588993344
*
*  If one or more digits occur the same number of times, the smallest digit must be printed first.
*/