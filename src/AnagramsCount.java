import java.util.*;

public class AnagramsCount {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        String s1 = S.nextLine();
        String s2 = S.nextLine();
        String s3 = s1 + " " + s2;
        String ss[] = s3.split(" ");
        int c = 0;
        for (int i = 0; i < ss.length; i++) {
            for (int j = i + 1; j < ss.length; j++) {
                if (isAnagram(ss[i], ss[j])) {
                    c++;
                }
            }
        }
        System.out.print(c);
    }

    public static boolean isAnagram(String a, String b) {
        char aa[] = a.toCharArray();
        char bb[] = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        a = String.valueOf(aa);
        b = String.valueOf(bb);
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
}


/*
but i will not true
hello lilw tub

helli i am a stu
uts ma ilhel

but i will not listen to him
water dropped into the silent tub
 */