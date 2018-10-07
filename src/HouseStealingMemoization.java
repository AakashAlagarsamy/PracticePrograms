import java.util.Scanner;

public class HouseStealingMemoization {
    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();
    static int[] house = new int[n];
    static int[] res = new int[n];
    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            res[i] = -1;
            house[i] = scanner.nextInt();
        }
        System.out.println(maxStealing(house, 0, n));
    }

    private static int maxStealing(int[] house, int i, int n) {
        if (i >= n)
            return 0;
        if (res[i]!=-1)
            return res[i];
        int yes = house[i] + maxStealing(house, i + 2, n);
        int no = maxStealing(house, i + 1, n);
        res[i] = yes > no ? yes : no;
        return res[i];
    }
}
