package IBM;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        EvenOrOddUsingBitWiseAND(n);
        EvenOrOddUsingModulus(n);
        EvenOrOddWithoutUsingModulus(n);
        EvenOrOddWithoutUsingShift(n);
    }

    private static void EvenOrOddWithoutUsingShift(int i) {
        int res = (i >> 1) << 1; // right by 1 bit and then left shift by 1 bit
        if (res == i)
            System.out.println(i + " is Even Number");
        else
            System.out.println(i + " is Odd Number");
    }

    private static void EvenOrOddWithoutUsingModulus(int i) {
        if ((i / 2) * 2 == i)
            System.out.println(i + " is Even Number");
        else
            System.out.println(i + " is Odd Number");
    }

    private static void EvenOrOddUsingBitWiseAND(int i) {
        int res = i & 1;
        if (res == 0)
            System.out.println(i + " is Even Number");
        else
            System.out.println(i + " is Odd Number");
    }

    private static void EvenOrOddUsingModulus(int i) {
        if (i % 2 == 0)
            System.out.println(i + " is Even Number");
        else
            System.out.println(i + " is Odd Number");
    }
}
