import java.util.Scanner;

public class Robot45 {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int x = S.nextInt();
        int y = S.nextInt();
        String s1 = S.next();
        S.nextLine();
        String s2 = S.nextLine();
        System.out.println(moveRobot(x, y, s1, s2));
    }

    private static String moveRobot(int input1, int input2, String input3, String input4) {
        int x = input1;
        int y = input2;
        String pts[] = input3.split("-");
        String st[] = input4.split(" ");
        int currx = Integer.parseInt(pts[0]);
        int curry = Integer.parseInt(pts[1]);
        String d = pts[2];
        int v = 0;
        for (int i = 0; i < st.length; i++) {
            if(!st[i].equals("M")) {
                if (d.equals("N")) {
                    if (st[i].equals("R"))
                        d = "NE";
                    else if (st[i].equals("L"))
                        d = "NW";
                } else if (d.equals("E")) {
                    if (st[i].equals("R"))
                        d = "SE";
                    else if (st[i].equals("L"))
                        d = "NE";
                } else if (d.equals("W")) {
                    if (st[i].equals("R"))
                        d = "NW";
                    else if (st[i].equals("L"))
                        d = "SW";
                } else if (d.equals("S")) {
                    if (st[i].equals("R"))
                        d = "SW";
                    else if (st[i].equals("L"))
                        d = "SE";
                } else if (d.equals("NE")) {
                    if (st[i].equals("R"))
                        d = "E";
                    else if (st[i].equals("L"))
                        d = "N";
                } else if (d.equals("NW")) {
                    if (st[i].equals("R"))
                        d = "N";
                    else if (st[i].equals("L"))
                        d = "W";
                } else if (d.equals("SE")) {
                    if (st[i].equals("R"))
                        d = "S";
                    else if (st[i].equals("L"))
                        d = "E";
                } else if (d.equals("SW")) {
                    if (st[i].equals("R"))
                        d = "W";
                    else if (st[i].equals("L"))
                        d = "S";
                }

            } else  {
                if (d.equals("N")) {
                    if (curry != y) {
                        curry += 1;
                    } else {
                        v = 1;
                        break;
                    }
                } else if (d.equals("E")) {
                    if (currx != x) {
                        currx += 1;
                    } else {
                        v = 1;
                        break;
                    }
                } else if (d.equals("W")) {
                    if (currx != 0) {
                        currx -= 1;
                    } else {
                        v = 1;
                        break;
                    }
                } else if (d.equals("S")) {
                    if (curry != 0) {
                        curry -= 1;
                    } else {
                        v = 1;
                        break;
                    }
                } else if (d.equals("NE")) {
                    if (currx != x && curry!= y) {
                        currx += 1;
                        curry += 1;
                    } else {
                        v = 1;
                        break;
                    }
                } else if (d.equals("NW")) {
                    if (currx != 0 && curry!= y) {
                        currx -= 1;
                        curry += 1;
                    } else {
                        v = 1;
                        break;
                    }
                } else if (d.equals("SE")) {
                    if (currx != x && curry!= 0) {
                        currx += 1;
                        curry -= 1;
                    } else {
                        v = 1;
                        break;
                    }
                } else if (d.equals("SW")) {
                    if (currx != 0 && curry!= 0) {
                        currx -= 1;
                        curry -= 1;
                    } else {
                        v = 1;
                        break;
                    }
                }
            }
        }
        if (v == 0)
            return "" + currx + "-" + curry + "-" + d;
        else
            return "" + currx + "-" + curry + "-" + d + "-" + "ER";
    }
}