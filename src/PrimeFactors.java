import java.util.Scanner;
public class PrimeFactors
{
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int i=2;
        int k=0;
        int a[]=new int[100];
        while(n>1)
        {
            if(n%i==0)
            {
                a[k]=i;
                k++;
                n=n/i;
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<k;j++)
            System.out.print(a[j]+" ");
    }
}