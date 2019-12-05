package ProblemSolving;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] a = new int[n];
        int r = S.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++)
            al.add(S.nextInt());
        Collections.rotate(al,al.size()-r);
        for(int i:al)
            System.out.print(i+" ");
    }
}


//https://www.hackerrank.com/challenges/array-left-rotation/problem