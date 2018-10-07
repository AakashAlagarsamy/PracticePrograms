import java.util.Scanner;

public class StaircaseWays {
    static Scanner S = new Scanner(System.in);
    static int e = S.nextInt();
    static int results[] = new int[e];

    public static int StaircaseMemoization(int s) {
        if (s == e) return 1;
        else if (s > e) return 0;
        if (results[s] != -1)
            return results[s];
        else {
            results[s] = StaircaseMemoization(s + 1) + StaircaseMemoization(s + 2);
            //System.out.println(s + " " + results[s]);
            return results[s];
        }
    }

    public static void main(String args[]) {

        for (int i = 0; i < (e); i++) {
            results[i] = -1;
        }
        System.out.println(StaircaseMemoization(0));
    }
}
