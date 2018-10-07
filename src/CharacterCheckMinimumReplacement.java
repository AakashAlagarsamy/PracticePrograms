import java.util.Scanner;

public class CharacterCheckMinimumReplacement {
    public static Scanner S = new Scanner(System.in);
    static String s1 = S.next();
    static String s2 = S.next();
    static char ch1[] = s1.toCharArray();
    static char ch2[] = s2.toCharArray();
    static int c1 = 0,c2 = 0,c3 = 0;
    public static void main(String args[])
    {
        System.out.print(CheckString(0,0));
    }
    public static int CheckString(int i,int j) {
        if (ch1[i] == ch2[j]){
            CheckString(i + 1, j + 1);
        return 0;
        }
        c1 = CheckString(i,j+1);
        c2 = CheckString(i+1,j);
        c3 = CheckString(i+1,j+1);
        return Math.min(c1,Math.min(c2,c3));
    }
}
