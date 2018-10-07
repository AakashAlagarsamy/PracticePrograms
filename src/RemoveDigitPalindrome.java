import java.util.Scanner;

public class RemoveDigitPalindrome {
    public static void main(String args[]) {
        System.out.print(digitRemove_Palin(new Scanner(System.in).nextInt()));
    }

    private static int digitRemove_Palin(int input1) {
        if(isPalinNumber(input1))
            return -1;
        else
        {
            String s = String.valueOf(input1),pal="";
            for(int i=0;i<s.length();i++)
            {
                String str = s.replace(""+s.charAt(i),"");
                if(isPalinNumber(Integer.parseInt(str)))
                {
                    pal = String.valueOf(s.charAt(i));
                    break;
                }
            }
            return Integer.parseInt(pal);
        }
    }
    public static boolean isPalinNumber(int input1){
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
