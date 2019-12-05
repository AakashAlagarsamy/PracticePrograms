package TCS_Test;

import java.util.*;

public class AsciiSolution {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        String s = S.nextLine();
        char s2[] = new char[100];
        int c = 0;
        String s1[] = s.split("");
        Arrays.sort(s1);
        for (int i = 0; i < s1.length; i++)
            if (((int) s1[i].charAt(0) > 64 && (int) s1[i].charAt(0) < 91)||((int) s1[i].charAt(0) > 96 && (int) s1[i].charAt(0) < 123)) {
                s2[c] = s1[i].charAt(0);
                c++;
            }
        System.out.println(s2[0]);
    }
}
