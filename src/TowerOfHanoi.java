import java.util.Scanner;

public class TowerOfHanoi {
    public static Scanner S = new Scanner(System.in);
    public static int start = 1;
    public static int n = S.nextInt();
    public static int c = 0;
    public static void main(String args[])
    {
        TOH(n,'A','C','B');
        System.out.println(c);
    }
    public static void TOH(int n,char from,char to,char using)
    {
        c++;
        if(start==n) {
            System.out.println("Move Disk " + n + " from " + from + " to " + to + " using " + using);
            return;
        }
        TOH(n-1,from,using,to);
        System.out.println("Move Disk "+n+" from "+from+" to "+to+" using "+using);
        TOH(n-1,using,to,from);
    }
}
