import java.util.Scanner;

public class Base6 {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        String s1 = S.next();
        String s2[] = s1.split(",");
        int a[] = new int[s2.length];
        int b[] = new int[s2.length];
        int c[] = new int[s2.length];
        //System.out.print(s2.length);
        int co=0;
        for(int i=0;i<s2.length;i++)
        {
            //System.out.print(s2[i]);
            a[i]=Integer.parseInt(s2[i]);
            b[i]=toBase6(a[i]);
            c[i]=toDerived(b[i]);
            //System.out.print(b[i]+" ");
            //System.out.print(c[i]+" ");
        }
        /*for(int i=0;i<s2.length-1;i++)
        {
            System.out.print(b[i]+" ");
            if(c[i]<c[i+1])
            {
                co++;
            }
        }*/
        co = getInvCount(c,s2.length);
        System.out.print(co);
    }

    private static int getInvCount(int[] arr, int n) {

            int inv_count = 0;
            for (int i = 0; i < n - 1; i++)
                for (int j = i+1; j < n; j++)
                    if (arr[i] > arr[j])
                        inv_count++;

            return inv_count;
        }


    private static int toDerived(int n) {
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n=n/10;
        }
        return sum;
    }

    private static int toBase6(int n) {
        /*if(n<6)
        {
            return n;
        }
        else if(n<36)
        {
            return (n+((n/6)*4));
        }
        else if(n<216)
        {

            return (n+((n/6)*4))+(40*(n/36));
        }
//        else if(n<108)
//        {
//            return (n+((n/6)*4))+0;
//        }
        else //if(n<1296)
        {
            return (n+((n/6)*4))+(400*(n/216));
        }*/

            int num = n, decimal_num, remainder, base = 1, base6 = 0, no_of_1s = 0;

            //printf("Enter a decimal integer \n");
           // scanf("%d", &num);
            while (num > 0)
            {
                remainder = num % 6;
                base6 = base6 + remainder * base;
                num = num / 6;
                base = base * 10;
            }
            //printf("Input number is = %d\n", decimal_num);
            return base6;
        }

}
