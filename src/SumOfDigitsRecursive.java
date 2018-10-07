//
//import java.util.Scanner;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Aakash Alagarsamy
// */
//public class SumOfDigitsRecursive {
//    public static void main(String args[])
//    {
//            int n,sum=0,b;
//            Scanner S =new Scanner(System.in);
//            n=S.nextInt();
//            while(n!=0)
//            {
//                while(n!=0)
//                {	
//                    sum+=n%10;
//                    n=n/10;
//                }
//            b=sum/10;
//            n=b;
//            }
//            System.out.println(sum);
//    }
//    
//}


import java.util.*;
public class SumOfDigitsRecursive 
{
	public static void main(String args[])
	{
		int n,sum=0,r,q,b;
		Scanner S =new Scanner(System.in);
		n=S.nextInt();
		b=n;
		while(n>9)
		{
                     sum=0;
		while(n!=0)
		{	
			r=n%10;
			q=n/10;
			sum=sum+r;
			n=q;
		}
		n=sum;
		//n=b;
               
		}
		System.out.println(sum);
	}

}






//#include <stdio.h>
//
//int main()
//{
//    int num;
//    scanf("%d",&num);
//    int n=num%9;
//            if(n==0)
//                printf("9");
//            else if(num==0)
//                printf("0");
//            else
//                printf("%d",n);
//
//    return 0;
//}