
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash Alagarsamy
 */
public class NPattern {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        int i;
        if(n%2==0)
        {
        for(i=0;i<n/2;i++)
        {
            System.out.print(i+1+" ");
            System.out.print(n-i+" ");
        }
        }
        else
        {
        for(i=0;i<=n/2-1;i++)
        {
            System.out.print(i+1+" ");
            System.out.print(n-i+" ");
        }
        System.out.print(i+1);
        }
    }
    
}
