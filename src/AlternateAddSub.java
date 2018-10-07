import java.util.*;

class AlternateAddSub {
    public static void main(String args[]) {
        System.out.print(AddSub(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
    }

    public static int AddSub(int input1, int input2) {
        int f = 0, s = input1;
        if (input2 == 1) {
            f = 1;
        } else {
            f = 0;
        }
        for (int i = input1 - 1; i >= 1; i--) {
            if (f == 1) {
                s = s - i;
                f = 0;
            } else {
                s = s + i;
                f = 1;
            }
        }
        return s;
    }
}