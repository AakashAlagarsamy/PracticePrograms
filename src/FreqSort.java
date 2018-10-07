import java.util.*;

public class FreqSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, cnt, k = 0;
        n = sc.nextInt();
        int aa[] = new int[n];
        int a[] = new int[n + 1];
        int e[] = new int[100];
        int count[] = new int[100];
        for (i = 0; i < n; i++) {
            aa[i] = sc.nextInt();
        }
        Arrays.sort(aa);

        for (i = 0; i < n; i++) {
            //System.out.print(a[i]+" ");
            a[i] = aa[i];
        }
        System.out.println();
        for (i = 0; i < n; i++) {

            if (a[i] != a[i + 1]) {
                e[k++] = a[i];
            }

        }
        k = 0;
        for (i = 0; i < n; i++) {
            cnt = 0;
            for (j = 0; j < n; j++) {
                if (e[i] == a[j])
                    cnt++;
            }

            if (cnt != 0)
                count[k++] = cnt;

        }
        for (i = 0; i < k; i++) {
            for (j = 0; j < k; j++) {
                if (count[i] >= count[j]) {
                    int temp = count[i];
                    count[i] = count[j];
                    count[j] = temp;
                    int t = e[i];
                    e[i] = e[j];
                    e[j] = t;
                }
            }
        }
//        for (i = 0; i < k; i++) {
//            if (count[i] == count[i + 1]) {
//                int te = e[i];
//                e[i] = e[i + 1];
//                e[i + 1] = te;
//            }
//        }
        for (i = 0; i < k; i++) {
            if (count[i] == count[i + 1]) {
                if (e[i] < e[i + 1]) {
                    int te = e[i];
                    e[i] = e[i + 1];
                    e[i + 1] = te;
                }
            }
        }
        for (i = 0; i < k; i++) {
            for (j = 0; j < count[i]; j++) {
                System.out.print(e[i] + " ");
            }
        }

    }
}



/*
12
6 6 6 2 2 4 4 4 5 5 5 5
6 2 5 5 6 2 4 5 5 4 4 6

5 5 5 5 6 6 6 4 4 4 2 2
 */

