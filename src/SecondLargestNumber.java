import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class SecondLargestNumber {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        System.out.print(secondLastDigitOf(n));
    }

    public static int secondLastDigitOf(int input1) {
        int n = Math.abs(input1);
        int i = 0;
        int a[] = new int[10];
        while (n > 0) {
            a[i] = n % 10;
            n = n / 10;
            i++;
        }
        if (i == 1) {
            return -1;
        } else {
            return a[1];
        }
    }
}