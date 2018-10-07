import java.util.*;
public class Stall {
    public static void main(String[] args) {
        int n, k, i, j, sum1 = 0;
        int i1, j1, sum2 = 0;
        int m1 = 0;
        int m = 0;
        int max = 0;
        int ans[] = new int[1000];
        int ans1[] = new int[1000];
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str1[] = str.split(",");
        n = Integer.parseInt(str1[0]);
        k = Integer.parseInt(str1[1]);
        int[] stall = new int[1000];
        int[] stall1 = new int[1000];
        for (i = 1; i <= n; i++) {

            stall[i] = s.nextInt();
            stall1[i] = stall[i];
        }
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j = j + k + 1) {

                sum1 = sum1 + stall[j];
                ans[m] = sum1;
                m++;
            }
            sum1 = 0;
        }
        for (i1 = 1; i1 <= n; i1++) {
            for (j1 = i1; j1 <= n; j1 = j1 + k + 1) {
                if (stall1[j1] < stall1[j1 + 1]) {
                    j1++;
                }
                sum2 = sum2 + stall1[j1];
                ans1[m1] = sum2;
                m1++;
            }
            sum2 = 0;

        }
        Arrays.sort(ans);
        Arrays.sort(ans1);
        if (ans[999] < ans1[999]) {
            max = ans1[999];
        } else {
            max = ans[999];
        }
        System.out.println(max);
    }
}
