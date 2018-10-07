import java.util.Scanner;
public class Cube {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int n = Integer.parseInt(S.nextLine());
        String st = S.nextLine();
        String ss[] = st.split(",");
        int x[] = new int[ss.length / 3];
        int y[] = new int[ss.length / 3];
        int z[] = new int[ss.length / 3];
        int j = 0;
        float f = 0.0f;
        for (int i = 0; i < ss.length - 1; i = i + 3) {
            x[j] = Math.abs(Integer.parseInt(ss[i]));
            y[j] = Integer.parseInt(ss[i + 1]);
            z[j] = Integer.parseInt(ss[i + 2]);
            j++;
        }
        for (int i = 0; i < j - 1; i++)
            f += calc(x[i], y[i], z[i], x[i + 1], y[i + 1], z[i + 1]);
        System.out.printf("%.2f",f);
//        f = ((float) ((int)(f*100))/100);
//        System.out.print(f);
    }
    public static float calc(int x1, int y1, int z1, int x2, int y2, int z2) {
        float f = 0.0f;
        if((x1==10 &&y1==10) ||(x1==10 && z1==10)||(y1==10 && z1==10)||(x1==0 &&y1==0) ||(x1==0 && z1==0)||(y1==0 && z1==0)||(x1==0 &&y1==10) ||(x1==0 && z1==10)||(y1==0 && z1==10)||(x1==10 &&y1==0) ||(x1==10 && z1==0)||(y1==10 && z1==0)||(x2==10 &&y2==10) ||(x2==10 && z2==10)||(y2==10 && z2==10)||(x2==0 &&y2==0) ||(x2==0 && z2==0)||(y2==0 && z2==0)||(x2==0 &&y2==10) ||(x2==0 && z2==10)||(y2==0 && z2==10)||(x2==10 &&y2==0) ||(x2==10 && z2==0)||(y2==10 && z2==0))
            return 0;
        else if ((x1 == x2 && y1 == y2) || (x1 == x2 && z1 == z2) || (y1 == y2 && z1 == z2))
            return 1.05f;
        else
            return (float) Math.ceil(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2)));
    }
}
