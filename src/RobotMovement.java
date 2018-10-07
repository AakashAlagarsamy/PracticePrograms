import java.util.Scanner;

public class RobotMovement {
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
        String pts[] = input3.split("-");
        String st[] = input4.split(" ");
        int currx = Integer.parseInt(pts[0]);
        int curry = Integer.parseInt(pts[1]);
        String d = pts[2];
        int v = 0;
        label:
        for (String aSt : st) {
            if (d.equals("N") && !aSt.equals("M")) {
                if (aSt.equals("R"))
                    d = "E";
                else if (aSt.equals("L"))
                    d = "W";
            } else if (d.equals("E") && !aSt.equals("M")) {
                if (aSt.equals("R"))
                    d = "S";
                else if (aSt.equals("L"))
                    d = "N";
            } else if (d.equals("W") && !aSt.equals("M")) {
                if (aSt.equals("R"))
                    d = "N";
                else if (aSt.equals("L"))
                    d = "S";
            } else if (d.equals("S") && !aSt.equals("M")) {
                if (aSt.equals("R"))
                    d = "W";
                else if (aSt.equals("L"))
                    d = "E";
            } else if (aSt.equals("M")) {
                switch (d) {
                    case "N":
                        if (curry != input2) {
                            curry += 1;
                        } else {
                            v = 1;
                            break label;
                        }
                        break;
                    case "E":
                        if (currx != input1) {
                            currx += 1;
                        } else {
                            v = 1;
                            break label;
                        }
                        break;
                    case "W":
                        if (currx != 0) {
                            currx -= 1;
                        } else {
                            v = 1;
                            break label;
                        }
                        break;
                    case "S":
                        if (curry != 0) {
                            curry -= 1;
                        } else {
                            v = 1;
                            break label;
                        }
                        break;
                }
            }
        }
        if (v == 0)
            return "" + currx + "-" + curry + "-" + d;
        else
            return "" + currx + "-" + curry + "-" + d + "-" + "ER";
    }
}