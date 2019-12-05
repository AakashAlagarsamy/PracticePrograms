package TCS_Xplore1;

import java.util.Scanner;

public class Solution3 {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter length");
        double l = S.nextDouble();
        System.out.println("Enter width");
        double b = S.nextDouble();
        System.out.println("Enter height");
        double h = S.nextDouble();
        System.out.println(Math.round(Area.calculateArea(l, b, h)) + ".0");

    }
}
