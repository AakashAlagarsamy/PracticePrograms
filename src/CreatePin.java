import java.util.*;
public class CreatePin {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();
        String s1=""+a;
        String s2=""+b;
        String s3=""+c;
        String s4 = ""+a+b+c;
        int in[] = new int[s4.length()];
        String[] ss1 = s1.split("");
        String[] ss2 = s2.split("");
        String[] ss3 = s3.split("");
        int m3 = Math.min(Math.min(Integer.parseInt(ss1[2]),Integer.parseInt(ss2[2])),Integer.parseInt(ss3[2]));
        int m2 = Math.min(Math.min(Integer.parseInt(ss1[1]),Integer.parseInt(ss2[1])),Integer.parseInt(ss3[1]));
        int m1 = Math.min(Math.min(Integer.parseInt(ss1[0]),Integer.parseInt(ss2[0])),Integer.parseInt(ss3[0]));
        for(int i=0;i<s4.length();i++) {
            in[i] = Character.getNumericValue(s4.charAt(i));
        }
        Arrays.sort(in);
        System.out.print(""+in[s4.length()-1]+""+m1+""+m2+""+m3);
    }
}