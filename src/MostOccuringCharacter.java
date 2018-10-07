import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class MostOccuringCharacter {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        String s1 = S.nextLine();
        TreeSet<Character> ts = new TreeSet<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                ts.add(s1.charAt(i));
            }
        }
        int c;
        Iterator it = ts.iterator();
        int j = 0, max = 0;
        char ch = '\0';
        char st[] = s1.toCharArray();
        while (it.hasNext()) {
            c = 0;
            char cc = (char) it.next();
            for (int i = 0; i < st.length; i++) {
                if (cc == s1.charAt(i)) {
                    c++;
                }

            }
            if (c > max) {
                max = c;
                ch = cc;
                //System.out.print(cc);
            }
        }
        System.out.print(ch);
    }
}

/*

Another logic without using treeset

import java.util.Scanner;

public class Most_occuring_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        int maxcount = -1;
        int index = 0;
        char a[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                index = i;
                //System.out.print(a[index]+" "+maxcount);
            }
            count = 0;
        }
        System.out.print(a[index] + " " + maxcount);
    }
}

 */
