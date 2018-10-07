import java.util.Scanner;

public class ParenthesisGeneration {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int pa = S.nextInt();
        char p[] = new char[20];
        Generate(p, pa, 0, 0, 0);
    }

    public static void Generate(char p[], int pa, int o, int c, int in) {
        if (in == 2 * pa) {
            for (int i = 0; i < in; i++) {
                System.out.print(p[i]);
            }
            System.out.println();
            return;
        }
        if (o < pa && c <= o) {
            p[in] = '(';
            Generate(p, pa, o + 1, c, in + 1);
        }
        if (c < pa) {
            p[in] = ')';
            Generate(p, pa, o, c + 1, in + 1);
        }
        return;
    }
}
