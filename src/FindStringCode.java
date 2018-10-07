import java.util.Scanner;

public class FindStringCode {
    public static void main(String args[]) {
        System.out.print(findStringCode(new Scanner(System.in).nextLine()));
    }

    private static int findStringCode(String input1) {
        input1 = input1.toUpperCase();
        String words[] = input1.split(" ");
        String res = "";
        for (int i = 0; i < words.length; i++)
            res += StringCode(words[i]);
        return Integer.parseInt(res);
    }

    private static String StringCode(String word) {
        int s = 0;
        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--)
            s += Math.abs(((int) (word.charAt(i)) - 64) - ((int) (word.charAt(j)) - 64));
        if (word.length() % 2 != 0)
            s += (int) word.charAt(word.length() / 2) - 64;
        return String.valueOf(s);
    }
}



/*
Hello World
2640
 */