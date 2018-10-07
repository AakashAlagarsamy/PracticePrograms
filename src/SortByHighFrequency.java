import java.util.*;

public class SortByHighFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> ferq = new ArrayList<>();
        String sr = scanner.next();
        for (int i = 0; i < sr.length(); i++) {
            al.add(Character.getNumericValue(sr.charAt(i)));
        }
        for (int i = 0; i < sr.length(); i++) {
            if (!input.contains(al.get(i))) {
                int count = check(al.get(i), al);
                input.add(al.get(i));
                ferq.add(count);
            }
        }
        sort(input, ferq);
        sort(ferq, input);
        for (int i = 0; i < ferq.size(); i++) {
            for (int j = 0; j < ferq.get(i); j++) {
                System.out.print(input.get(i) + " ");
            }
        }
    }
    static int check(int count, ArrayList<Integer> ak) {
        int temp = 0;
        for (int i = 0; i < ak.size(); i++) {
            if (count == ak.get(i)) {
                temp++;
            }
        }
        return temp;
    }
    static void sort(ArrayList<Integer> ferq, ArrayList<Integer> input) {
        for (int i = 0; i < ferq.size(); i++) {
            for (int j = i + 1; j < ferq.size(); j++) {
                if (ferq.get(i) < ferq.get(j)) {
                    int temp = ferq.get(j);
                    ferq.set(j, ferq.get(i));
                    ferq.set(i, temp);
                    int temp1 = input.get(j);
                    input.set(j, input.get(i));
                    input.set(i, temp1);
                }
            }
        }
    }
}
