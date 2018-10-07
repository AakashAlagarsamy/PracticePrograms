import java.util.*;
public class MinPurchase {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int a[]=new int[n];
        int t=0,c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {   
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<=a[i]+4&&a[i]!=0)
                {
                    a[i]=0;
                    c++;   
                }
            }
          if(c>=1){
           i+=c;
            t++;
          }
        }
        System.out.println(t+1);
    }
}