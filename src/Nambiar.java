import java.util.Scanner;

public class Nambiar {
    public static void main(String args[]) {
        System.out.print(GetNambiar(new Scanner(System.in).next()));
    }

    private static int GetNambiar(String input1) {
        String res = "";
        int j, s = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (Character.getNumericValue(input1.charAt(i)) % 2 == 0) {
                for (j = i; j < input1.length(); j++) {
                    s += Character.getNumericValue(input1.charAt(j));
                    if (s % 2 != 0)
                        break;
                }
            } else {
                for (j = i; j < input1.length(); j++) {
                    s += Character.getNumericValue(input1.charAt(j));
                    if (s % 2 == 0)
                        break;
                }
            }
            i = j;
            //System.out.println(s);
            res = res + s;
            s = 0;
        }
        return Integer.parseInt(res);
    }
}

/*

 */