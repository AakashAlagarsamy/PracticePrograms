import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
//        int min = Math.min(a,b);
//        for(int i=min;i>=0;i--){
//            if(a%i==0 && b%i==0){
//                System.out.print(i);
//                break;
//            }
//        }
        int m = Math.max(a,b);
        int g;
        for(int i=m;;i--)
            if(b%i==0 && a%i==0)
            {
                g = i;
                break;
            }
        System.out.print(g);
    }

}

/*
acheron software consultancy private limited
9th online assesments
associate sw eng
3.5 to 4
*/