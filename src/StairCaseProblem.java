import java.math.BigDecimal;
import java.util.Scanner;

public class StairCaseProblem {
    private static Scanner scanner = new Scanner(System.in);
//    private static int s = scanner.nextInt();
    private static int n = scanner.nextInt();
    static BigDecimal sc=new BigDecimal(-1);

    //private static int[] results = new int[n];
    private static BigDecimal[] results = new BigDecimal[n];

    public static void main(String args[]) {
        for (int i = 0; i < n; i++)
            results[i] = sc;
        //System.out.print(Staircase(0));
        System.out.println(StaircaseMemoizationBD(0));
    }

    private static int Staircase(int s) {
        if (s == n) return 1;
        else if (s > n) return 0;
        return Staircase(s + 1) + Staircase(s + 2);
    }

   /* private static int StaircaseMemoizationInt(int s) {
        if (s == n) {

            return 1;
        }
        else if (s > n) {

            return 0;
        }
        if (results[s] != -1) return results[s];
        else {
            results[s]=StaircaseMemoizationInt(s + 1) + StaircaseMemoizationInt(s + 2);
            return results[s];
        }
    }*/
    private static BigDecimal StaircaseMemoizationBD(int s) {

        if (s == n)
            return new BigDecimal(1);
        else if (s > n)
            return new BigDecimal(0);

        if (!results[s].equals(sc))
            return results[s];
        else {
            results[s] = (StaircaseMemoizationBD(s + 1)).add(StaircaseMemoizationBD(s + 2));
            System.out.println(s+" "+results[s]);
            return results[s];
        }
    }
}