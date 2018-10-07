import java.util.Scanner;

public class WafforStringPattern {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String str = S.next();
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if((i+j==str.length()-1)||(i==j))
                {
                    System.out.print(str.charAt(j)+"");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
