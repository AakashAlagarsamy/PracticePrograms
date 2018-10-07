package Hackerrank;

import java.util.Scanner;
import java.util.TreeSet;

public class Eliminate_Repeated_Elements {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
        int n = a + b;
        int arr[] = new int[n + 1];       //one extra size for the check duplicates with next element
        int brr[] = new int[n + 1];
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();        //affects when remove duplicates
            brr[i] = arr[i];             //copy for checking count
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {     //find duplicates
                    for (int k = j; k < n; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;                //reduce size or increment duplicate elements size
                    j--;
                }
            }
        }
//        for(int i=0;i<n;i++)
//        System.out.println(arr[i]);
        int d = 0;
        for (int i = 0; i < n; i++) {
            c = 0;
            for (int j = 0; j < a + b; j++)
                if (arr[i] == brr[j])      //increment frequency
                    c++;
            if (c == 1)                    //check count is 1
                d++;
        }
        System.out.println(d);
    }
}
