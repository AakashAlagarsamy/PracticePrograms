import java.util.Scanner;

public class WeightHillPattern {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        System.out.print(totalHillWeight(S.nextInt(), S.nextInt(), S.nextInt()));
    }

    public static int totalHillWeight(int input1, int input2, int input3) {
        int n = input1;
        int a = input2;
        int in = input3;
        int sum = 0;
        a -= in;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                //System.out.print(a);
                sum += a;
            }
            //System.out.println();
            a += in;
        }
        return sum;
    }
}


// ip1=level
// ip2=startingvalue
// ip3=increment