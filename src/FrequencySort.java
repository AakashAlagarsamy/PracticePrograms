import java.util.*;

public class FrequencySort {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        String s1 = S.nextLine();
        String[] s2 = s1.split(" ");
        int a[] = new int[s2.length + 1];
        for (int i = 0; i < s2.length; i++) {
            a[i] = Integer.parseInt(s2[i]);
        }
        for (int i = 0; i < s2.length - 1; i++)
            for (int j = 0; j < s2.length - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
        int k = 0;
        int b[] = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            if (a[i] != a[i + 1]) {
                b[k++] = a[i];
            }
        }
        int[] co = new int[k];
        k = 0;
        for (int i = 0; i < s2.length; i++) {
            int c = 0;
            for (int j = 0; j < s2.length; j++) {
                if (b[i] == a[i]) {
                    c++;
                }
            }
            if (c != 0) {
                co[k++] = c;
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (co[i] >= co[j]) {
                    int tt = co[i];
                    co[i] = co[j];
                    co[j] = tt;
                    int x = b[i];
                    b[i] = b[j];
                    b[j] = x;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            if (co[i] == co[i + 1]) {
                int x = b[i];
                b[i] = b[i + 1];
                b[i + 1] = x;
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < co[i]; j++) {
                System.out.print(b[i] + " ");
            }
        }
    }
}



/*
 *
 * 6 6 6 2 2 4 4 4 5 5 5 5
 * 5 5 5 5 6 6 6 4 4 4 2 2
 */