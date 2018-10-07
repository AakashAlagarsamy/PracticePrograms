import java.util.Scanner;

public class DiamondPattern {

    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        boolean b;
        int num, sp, k;
        for (int i = 0; i < n; i++) {
            b = true;
            k = 1;
            for (sp = 0; sp < n - i; sp++) {
                System.out.print(" ");
            }
            for (num = 1; num <= ((2 * n) - (2 * sp)) + 1; num++) {
                if (k == i + 1) {
                    b = false;
                }
                if (b) {
                    System.out.print(k);
                    k++;
                } else {
                    System.out.print(k);
                    k--;
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            b = true;
            k = 1;
            for (sp = 0; sp < n - i; sp++) {
                System.out.print(" ");
            }
            for (num = 1; num <= ((2 * n) - (2 * sp)) + 1; num++) {
                if (k == i + 1) {
                    b = false;
                }
                if (b) {
                    System.out.print(k);
                    k++;
                } else {
                    System.out.print(k);
                    k--;
                }
            }
            System.out.println();
        }
    }
}