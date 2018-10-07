package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SortedLinkedList {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String s1 = S.nextLine();
        String s2 = S.nextLine();
        String s3 = s1 + s2;
        String ss1[] = s3.split(" ");
        String ss2[] = s2.split(" ");
//        int ss[] = new int[ss1.length+ss2.length-2];
//        int k=0;
//        for(int i=0;i<ss1.length;i++)
//        {
//            if(!ss1[i].equals("-1")) {
//                ss[k++]=Integer.parseInt(ss1[i]);
//            }
//        }
//        for(int i=0;i<ss2.length;i++)
//        {
//            if(!ss2[i].equals("-1"))
//                ss[k++]=Integer.parseInt(ss2[i]);
//        }
//        Arrays.sort(ss);
        for(int i=0;i<ss1.length;i++)
        {
            System.out.print(ss1[i]+" ");
        }
    }
}
