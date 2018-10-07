package Hackerrank;

import java.util.Scanner;

public class GCDOfNNumbers {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = S.nextInt();
        }
        int g = a[0];
        for (int i = 1; i < n; i++) {
            g = GCD(a[i], g);
        }
        System.out.println(g);
    }

    private static int GCD(int a, int b) {
        int m = Math.max(a, b);
        int g;
        for (int i = m; ; i--)
            if (b % i == 0 && a % i == 0) {
                g = i;
                break;
            }
        //System.out.print(g);
        return g;
    }
}


/*
Alternative

import java.io.*;
import java.util.*;

public class Solution {

    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);

        return result;
    }

    public static void main(String[] args)
    {
Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = S.nextInt();
        }
        //int n = arr.length;
        System.out.println(findGCD(a, n));
    }
}


 */