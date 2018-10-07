import java.util.Scanner;

public class InterlacedString {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String str= S.next();
        int n = S.nextInt();
        int i;
        for(i=0;i<2*n;i=i+2)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        for(i=1;i<2*n;i=i+2)
        {
            System.out.print(str.charAt(i));
        }
        for(int j=i-1;j<str.length();j++)
        {
            System.out.print(str.charAt(j));
        }
    }
}
