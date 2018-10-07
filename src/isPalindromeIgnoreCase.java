import java.util.Scanner;

public class isPalindromeIgnoreCase {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        if (isPalindrome(S.next())) {
            System.out.print("Palimdrome");
        } else {
            System.out.print("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String input1) {
        //StringBuffer sb = new StringBuffer(input1);
        StringBuilder sb = new StringBuilder(input1);
        String A = sb.reverse().toString();
        if (A.equalsIgnoreCase(input1)) {
            return true;
        } else {
            return false;
        }
    }
}

