/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Rajan
Roy
123477
6



RRoy71

 */
import java.util.*;
/**
 *
 * @author Aakash Alagarsamy
 */
public class UserIdGeneration {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String f_name=S.next();
        String l_name=S.next();
        String b_name=" ";
        String s_name=" ";
        String Final=" ";
        String pin=S.next();
        int n=S.nextInt();
        if(f_name.length()>l_name.length())
        {
            b_name=f_name;
            s_name=l_name;
        }
        else if(f_name.length()<l_name.length())
        {
            b_name=l_name;
            s_name=f_name;
        }
        else if(f_name.length()==l_name.length())
        {
            int c = f_name.compareTo(l_name);
            if(c<0)                                       
            {
                s_name=f_name;
                b_name=l_name;
            }
            else
            {
                s_name=l_name;    
                b_name=f_name;


            }
                  
        }
        Final=b_name.charAt(0)+s_name+pin.charAt(n-1)+pin.charAt(pin.length()-n);
//        for(int i=0;i<Final.length();i++)
//        {
//            Character c = Final.charAt(i);
//            if(Character.isLowerCase(c))
//                Final.repl
//            else
//                Final.toLowerCase(c);
//        }
        StringBuffer sb = new StringBuffer(Final);
        convertOpposite(sb);
//        System.out.println(Final);
    }
     public static void convertOpposite(StringBuffer str)
     {
        int ln = str.length();
        for (int i=0; i<ln; i++)
        {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");
        }
        System.out.println(str);
     }
        
}
