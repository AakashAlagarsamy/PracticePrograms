import java.util.Scanner;

public class ExpandAlphabetsOccurance {
    //    public static void main(String args[])
//    {
//        Scanner S = new Scanner(System.in);
//        String sr = S.next();
//        char c[] = sr.toCharArray();
//        for(int i=0;i<c.length;i=i+2)
//        {
//            for(int j=0;j<Character.getNumericValue(c[i+1]);j++)
//            {
//                System.out.print(c[i]);
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sftr = scanner.nextLine();
        String temp = "";
        for (int i = 0; i < sftr.length(); i++) {
            if (Character.isDigit(sftr.charAt(i))) {
                for (int j = 0; j < temp.length(); j++) {
                    for (int k = 0; k < Character.getNumericValue(sftr.charAt(i)); k++) {
                        System.out.print(temp.charAt(j));
                    }
                }
                temp = "";
            } else {
                temp += sftr.substring(i, i + 1);
            }
        }
    }
}



/*
 * a2d3f2g4
 * aadddffgggg
 * working perfectly
 *
 * ab5c6e2
 * aaaaabbbbbccccccee
 */