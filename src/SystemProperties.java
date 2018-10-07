import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class SystemProperties {
    public static void main(String args[]) {
        double a=12.77777778;
        //int b=2; //Here 'b' indicates the number of decimal points truncated
        //a=(double) (((int)(Math.pow(10,2)*a))/Math.pow(10,2));
        a = ((double) ((int)(a*100))/100);
        System.out.print(a);
    }
}
