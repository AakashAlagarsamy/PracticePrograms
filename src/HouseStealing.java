import java.util.Scanner;

public class HouseStealing {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] house = new int[n];
        for (int i = 0; i < n; i++) {
            house[i] = scanner.nextInt();
        }
        System.out.println(maxStealing(house, 0, n));
    }

    private static int maxStealing(int[] house, int i, int n) {
        if (i >= n)
            return 0;
        int yes = house[i] + maxStealing(house, i + 2, n);
        int no = maxStealing(house, i + 1, n);
        return yes > no ? yes : no;
    }
}
