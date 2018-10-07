import java.util.*;
public class Robot2 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        String curr = read.next();
        read.nextLine();
        String str = read.nextLine();
        System.out.print(moveRobot(x, y, curr, str));
    }

    public static String moveRobot(int input1, int input2, String input3, String input4)
    {
        int x = input1;
        int y = input2;
        String curr = input3;
        String str = input4;
        String[] arr=curr.split("-");
        int currx=Integer.parseInt(arr[0]);
        int curry=Integer.parseInt(arr[1]);
        String direction=arr[2];
        String ch[] = str.split(" ");
        String notvalid="";
        for(int i=0;i<str.length();i++)
        {
            if(direction.equals("N") && ch[i].equals("L"))
                direction="W";
            else if(direction.equals("N") && ch[i].equals("R"))
                direction="E";
            else if(direction.equals("S") && ch[i].equals("L"))
                direction="E";
            else if(direction.equals("S") && ch[i].equals("R"))
                direction="W";
            else if(direction.equals("E") && ch[i].equals("L"))
                direction="N";
            else if(direction.equals("E") && ch[i].equals("R"))
                direction="S";
            else if(direction.equals("W") && ch[i].equals("L"))
                direction="S";
            else if(direction.equals("W") && ch[i].equals("R"))
                direction="N";
            else if(direction.equals("S") && ch[i].equals("M"))
            {
                if(curry!=0)
                    curry=curry-1;
                else {
                    notvalid="ER";
                    break;}
            }
            else if(direction.equals("N") && ch[i].equals("M"))
            {
                if(curry!=y)
                    curry=curry+1;
                else {notvalid="ER";
                    break;}
            }
            else if(direction.equals("E") && ch[i].equals("M"))
            {
                if(currx!=x)
                    currx=currx+1;
                else {notvalid="ER";
                    break;}
            }
            else if(direction.equals("W") && ch[i].equals("M"))
            {
                if(currx!=0)
                    currx=currx-1;
                else{ notvalid="ER";
                    break;}
            }
        }
        if(notvalid!="")
            return currx+"-"+curry+"-"+direction+"-"+notvalid;
        else
            return currx+"-"+curry+"-"+direction;
    }
}


/*
3
4
2-2-E
R M L M L M R M

3-2-E-ER
 */