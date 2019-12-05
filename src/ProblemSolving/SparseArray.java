package ProblemSolving;

import java.util.Scanner;

public class SparseArray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
            arr[i] = S.next();
        int m = S.nextInt();
        int[] res = new int[m];
        //String[] qry = new String[m];
        for(int i=0;i<m;i++){
            int c = 0;
            String qry = S.next();
            for(int j=0;j<n;j++){
                if(qry.equals(arr[j]))
                    c++;
            }
            res[i]=c;
        }
        for(int i=0;i<m;i++){
            System.out.println(res[i]);
        }

    }
}
//https://www.hackerrank.com/challenges/sparse-arrays/problem