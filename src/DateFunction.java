import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunction {
    public static void main(String args[])
    {
        System.out.println(getCurrentTimeStamp());
    }
//
//    private static String Date(String date) {
//        String dateArray[] = date.split(" ");
//        return ""+dateArray[2]+"-"+dateArray
//    }
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");  //dd/MM/yyyy
        Date now = new Date();
        //System.out.println(now.toString());
        String strDate = sdfDate.format(now);
        return strDate;
    }
}
