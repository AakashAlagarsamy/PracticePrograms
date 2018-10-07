import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        System.out.print(NthPrime(S.nextInt()));
    }

    public static int NthPrime(int input1) {
        int k = 10000;
        int c[] = new int[10000];
        int j = 1;
        for (int i = 1; i <= k; i++) {
            if (isPrime(i)) {
                c[j] = i;
                j++;
            }
        }
        return c[input1];


    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            int f = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }
            if (f == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}

