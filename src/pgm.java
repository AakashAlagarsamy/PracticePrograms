import java.lang.annotation.*;
public class pgm {
    //@Override
    public static void main(String args[])
    {
//        Aa a10 = new Aa();
//        a10.calc(3);
        try {
            Integer yen = 11;//new Integer(10);
            Double dd = 10.2;
            System.out.print(yen * dd);
        }
        catch(Exception e)
        {
            System.out.print("J");
        }
    }
}
/*class Aa
{
    public void calc(Integer i) {
        System.out.print("Integer:"+i);
    }
    public void calc(int i) {
        System.out.print(i);
    }
}
*/