import java.util.Scanner;

public class GetMatrix {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String s = S.nextLine();
        String ss[] = s.split(" ");
        char a[][] = new char[ss.length][ss.length];
        String sss[] = new String[ss.length-1];
        String st[][] = new String[ss.length-1][ss.length];
        for(int i=0;i<ss.length-1;i++)
        {
            sss[i] = S.nextLine();
            //st[i][] = sss[i].split(" ");
        }

        for(int i=0;i<ss.length;i++)
        {
            for(int j=0;j<ss.length;j++)
            {
                if(i==0)
                {
                    //a[i][j] =
                }
                else
                {

                }
            }
        }
    }
}
