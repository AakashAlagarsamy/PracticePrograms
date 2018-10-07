import java.util.Scanner;

public class TreeShadowMatrix {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int r = S.nextInt();
        int c = S.nextInt();
        int a[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = S.nextInt();
            }
        }
        char ch = S.next().charAt(0);
        int co = 0;
        switch (ch) {
            case 'L':
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c - 1; j++) {
                        if (a[i][j] == 1 && a[i][j + 1] == 0) {
                            co++;
                            //System.out.println(i+" "+j);
                        }
                    }
                }
                break;
            case 'R':
                for (int i = 0; i < r; i++) {
                    for (int j = 1; j < c; j++) {
                        if (a[i][j] == 1 && a[i][j - 1] == 0) {
                            co++;
                            //System.out.println(i+" "+j);
                        }
                    }
                }
                break;
            case 'F':
                for (int i = 1; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (a[i][j] == 1 && a[i - 1][j] == 0) {
                            co++;
                            //System.out.println(i+" "+j);
                        }
                    }
                }
                break;
            case 'B':
                for (int i = 0; i < r - 1; i++) {
                    for (int j = 0; j < c; j++) {
                        if (a[i][j] == 1 && a[i + 1][j] == 0) {
                            co++;
                            //System.out.println(i+" "+j);
                        }
                    }
                }
                break;
        }
        System.out.println(co);
    }
}


/*
3 5
1 0 0 1 0
0 1 0 1 1
1 1 1 0 0
L
4


3 5
1 0 0 1 0
0 1 0 1 1
1 1 1 0 0
B
3
 */