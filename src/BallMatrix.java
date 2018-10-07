import java.util.Scanner;

public class BallMatrix {
    //    public static int f = 0;
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        char a[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = S.next().charAt(0);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //for (int i=0;i<n;i++)
        //{
        //int t = Mat(a,n);
        //System.out.print(t);
        if (Mat(a, n) == n)
            System.out.print("0");
        else
            System.out.print("-1");
        //}
    }

    public static int Mat(char a[][], int n) {
        int k = 0, c = 0;
        String s1 = "";
        String s[] = new String[n];
        int f[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s1 += Character.toString(a[i][j]);
            }
        }
        for (int j = 0; j < s1.length(); j = j + 4) {
            s[k] = s1.substring(j, j + 4);
            //System.out.println(s[k]);

            f[k] = CheckRow(s[k], k, n);
            if (f[k] == 0) {
                c++;
            }
            k++;
        }
//        System.out.println(s.length);
//        System.out.print(s1.length());
        return c;
    }

    private static int CheckRow(String s, int k, int n) {
        int f = 0;

        //for(int i=0;i<n;i++)
        //{
        //System.out.println(s.lastIndexOf("R"));
        if (!(s.lastIndexOf("R") <= k))
            f = 1;
        //}
        //System.out.println(f);
        return f;
    }
}


/*
4
R G G G
R G R G
G R G G
R G R G


4
R G G G
G R G G
R G R G
G G R R
 */