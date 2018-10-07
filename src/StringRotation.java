import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringRotation {
    public static Scanner S = new Scanner(System.in);
    public static String s = S.next();
    public static char cc[] = s.toCharArray();
    public static int n = S.nextInt();
    public static String ans = "";
    public static void main(String args[])
    {

        for(int i=0;i<n;i++)
        {
            ans += StringRotate(S.next().charAt(0),S.nextInt());
        }
        System.out.print(ans);
    }

    private static String StringRotate(char c, int n) {
        ArrayList<Character> al = new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            al.add(s.charAt(i));
        }
        if(c=='L')
        {
            for(int i=0;i<n;i++)
            {
                al.add(al.remove(0));
            }
        }
        else
        {

        }
        return "aa";
    }
}
