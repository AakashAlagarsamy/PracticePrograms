import java.util.Scanner;

public class CharacterCountSkillRack {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        String str = S.next();
        int l = str.length();
        int n = S.nextInt();
        char c = S.next().charAt(0);
        int j = 0, co = 0;
        for (int i = 0; i < l; i++) {
            if (c == str.charAt(i)) {
                co++;
            }
        }
        int fin = co * (n / l);
        for (int i = 0; i < l % n; i++) {
            if (c == str.charAt(i)) {
                j++;
            }
        }
        System.out.print(fin + j);
    }
}

//        String cc = "";
//        for (int i = 0; i < n; i++) {
//            if (j == l) {
//                j = 0;
//            }
//            cc += str.charAt(j);
//            j++;
//        }
//        for (int k = 0; k < n; k++) {
//            if (c == cc.charAt(k)) {
//                co++;
//            }
//        }

/*
 * abcd
 * 10
 * b
 * abcdabcdab
 * 3
 */