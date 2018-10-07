import java.util.Scanner;

public class RemoveOdd {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String s1 = S.next();
        String a =  "";
        int c=0,d=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.getNumericValue(s1.charAt(i))%2==0)
            {
                d++;
                a += s1.charAt(i);
            }
            else
            {
                c++;
            }
        }
        if(d!=0 && c!=0)
            System.out.print(a);
        else
            System.out.print("-1");
    }
}
