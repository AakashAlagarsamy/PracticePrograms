import java.util.Scanner;

public class isPalinPossible {

    public static void main(String[] args)
    {
        int j=0;
        String st[] = new String[100000];
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        String str = String.valueOf(a);
        int n = str.length();
        int c = 0,ret=0;
        isPalinPossible permutation = new isPalinPossible();
        permutation.permute(str, 0, n-1);
        //System.out.print(st.length);
        for(int i=0;i<j;i++)
        {
            if(isPalindrome(st[i]))
            {
                c++;
            }
            else
            {
                c=-1;
            }
        }
        System.out.print(c);
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    public void permute(String str, int l, int r)
    {
        //int j=0;
        if (l == r) {
            //System.out.println(str);
            //st[j]=str;
            //j++;
        } else {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String A = sb.reverse().toString();
        if (A.equals(s)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
