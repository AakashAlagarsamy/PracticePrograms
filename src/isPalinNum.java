import java.util.Scanner;

public class isPalinNum {

        public static void main(String args[])
        {
            Scanner S = new Scanner(System.in);
            if(isPalinNumber(S.nextInt()))
            {
                System.out.print("Palindrome");
            }
            else
            {
                System.out.print("Not a Palindrome");
            }
        }
        public static boolean isPalinNumber(int input1){
            // Read only region end
            // Write code here...
            String s = ""+input1;
            StringBuilder sb = new StringBuilder(s);
            String A = sb.reverse().toString();
            if (A.equals(s)) {
                return true;
            } else {
                return false;
            }
        }
    }
