import java.util.Scanner;
public class WifiPassword {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        String r=S.next();
        String n=S.next();
        char a[]={')','!','@','#','$','%','^','&','*','('};
        char p[]=new char[4];
        int s=0;
        if(r.length()==3)
        {
            p[3]=r.charAt(1);
            p[2]=n.charAt(n.length()-1);
            p[1]=a[Character.getNumericValue(r.charAt(2))];
            int num=Integer.parseInt(r);
            while(num>0)
            {
                s=s+num%10;
                num=num/10;
                if(num==0 && s>9)
                {
                    num=s;
                    s=0;
                }
            }
            
            
            
            //
			
			//sum of digits upto individual digit without using while 
			//input = num
//            int n=num%9;
//            if(n==0)
//                printf("9");
//            else if(num==0)
//                printf("0");
//            else
//                printf("%d",n);
            //
            
            
            
            p[0]=Character.forDigit(s, 10);
            for(int i=0;i<4;i++){System.out.print(p[i]);}
        }
        else
        {
            System.out.println("Invalid Room Number");
        }
    }
    
}
