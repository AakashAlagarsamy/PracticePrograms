import java.util.*;

public class ProcessString {
    // Read only region start
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        System.out.println(processWords(S.nextLine(), S.nextInt()));
    }

    public static String processWords(String input1, int input2) {
        // Read only region end
        String str = input1;
        String num = String.valueOf(input2);
        String nu[] = num.split("");
        int a = Integer.parseInt(nu[0]);
        int b = Integer.parseInt(nu[1]);
        String st[] = str.split(" ");
        String s1 = st[a - 1];
        String s2 = st[b - 1];
        String sr1, sr2, sr31, sr32;
        int l1 = s1.length();
        int l2 = s2.length();
        StringBuffer sb1 = new StringBuffer(s1);
        String s1rev = sb1.reverse().toString();
        StringBuffer sb2 = new StringBuffer(s2);
        String s2rev = sb2.reverse().toString();
        sr1 = s1rev.substring(l1 / 2, l1);
        sr2 = s1.substring(l1 / 2, l1);
        sr31 = sr1 + sr2;
        sr1 = s2rev.substring(l2 / 2, l2);
        sr2 = s2.substring(l2 / 2, l2);
        sr32 = sr1 + sr2;
        String fin = sr31 + " " + sr32;
        return fin;
    }
}
