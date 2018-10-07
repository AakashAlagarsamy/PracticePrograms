import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author vigne
 */
public class Min {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> p=new ArrayList<Integer>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            int temp=scanner.nextInt();
            p.add(temp);
        }
       // System.out.println("viki");
        Collections.sort(p);
        
        int temp=0;
        
        for(int i=0;i<p.size();i++)
        {   
           // System.out.println(p.get(i));
            int count=0;
            for(int j=1;j<=4;j++)
            {
                if(p.contains(p.get(i)+j))
                {
                    count++;   
                }
                //System.out.println(count);
            }
         // System.out.println(count);
          if(count>=1){
           i+=count;
            temp++;
          }
           
        }
        System.out.println(temp);
    }
    
}
