import java.util.Scanner;

public class isPalindrome {

    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        if(isPalinNumber(S.next()))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not a Palindrome");
        }
    }
    public static boolean isPalinNumber(String s){
        StringBuilder sb = new StringBuilder(s);
        String A = sb.reverse().toString();
        if (A.equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}
