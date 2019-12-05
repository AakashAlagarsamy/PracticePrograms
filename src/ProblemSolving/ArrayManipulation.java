package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    private static Scanner S = new Scanner(System.in);
    private static int n = S.nextInt();
    private static int m = S.nextInt();
    private static int[] arr = new int[n];

    public static void main(String[] args) {
        for(int i=0;i<m;i++)
            manipulate(S.nextInt(),S.nextInt(),S.nextInt());
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }

    private static void manipulate(int a, int b, int sum) {
        for(int i=a-1;i<=b-1;i++)
            arr[i]+=sum;
    }
}


//https://www.hackerrank.com/challenges/crush/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen