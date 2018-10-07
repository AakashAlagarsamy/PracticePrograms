import java.util.Arrays;
import java.util.Scanner;

public class PermutationDivByNum {
    static Scanner S = new Scanner(System.in);
    static String str = S.next();
    static int n = str.length();
    static String res[] = new String[Factorial(n)];
    public static void main(String[] args)
    {
//        Scanner S = new Scanner(System.in);
//        String str = S.next();
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        //int n = str.length();
        permute(new String(ch), 0, n-1);
        for(int i=0;i<Factorial(n);i++)
        {
            System.out.println(res[i]);
        }
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private static void permute(String str, int l, int r)
    {
        if (l == r)
            //System.out.println(str);
            res[l]=str;
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static int Factorial(int n)
    {
        if(n==1||n==0)
            return 1;
        else
            return n*Factorial(n-1);
    }
}
