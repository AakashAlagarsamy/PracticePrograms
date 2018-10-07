import java.util.Scanner;

public class ZigZagPattern {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        String s = S.next();
        String ap = "";
        int n = S.nextInt();
        int c=0;
        if(s.length()%n!=0) {
            int r = n - (s.length() % n);
            for (int i = 0; i < r; i++) {
                ap += "*";
            }
            s = s + ap;
        }
        System.out.print(s);
        StringBuffer sb = new StringBuffer(s);
        String ss = sb.reverse().toString();
    }
}
