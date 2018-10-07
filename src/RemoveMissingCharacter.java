import java.util.Scanner;
import java.util.TreeSet;

public class RemoveMissingCharacter {
    public static void main(String args[])
    {
//        Scanner S = new Scanner(System.in);
//        int n = S.nextInt();
//        String st[] = new String[n];
//        for(int i=0;i<n;i++)
//        {
//            st[i]=S.next();
//        }
//        String res = "";
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i+1;j<n;j++)
//            {
//                res += isMatch(st[i],st[j]);
//            }
//        }
        System.out.print(isMatch("abcdee","abckk"));
    }

    public static String isMatch(String s1, String s2) {
        String ret = "";
        String re = "";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    ret += s1.charAt(i);
                }
            }
        }
        char a[] = ret.toCharArray();
        String s3 = s1+s2;
        for(int i=0;i<ret.length();i++)
        {
            if(!s3.contains(String.valueOf(ret.charAt(i))))
            {
                re += s3.charAt(i);
            }
        }
        return re;
    }
}
