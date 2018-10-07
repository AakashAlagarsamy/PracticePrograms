import java.util.Scanner;

public class OnACube {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n = Integer.parseInt(S.nextLine());
        String st = S.nextLine();
        String ss[] = st.split(",");
        int x[] = new int[ss.length/3];
        int y[] = new int[ss.length/3];
        int z[] = new int[ss.length/3];
        int j=0;
        float f= 0.0f;
        for(int i=0;i<ss.length-1;i=i+3)
        {

//            if(j==3)
//            {
//                j=0;
//            }
            x[j]=Integer.parseInt(ss[i]);
            y[j]=Integer.parseInt(ss[i+1]);
            z[j]=Integer.parseInt(ss[i+2]);
            j++;

        }
//        for(int i=0;i<j;i++)
//        {
//            System.out.println(x[i]+" "+y[i]+" "+z[i]);
//        }
        for(int i=0;i<j-1;i++)
        {
            f += calc(x[i],y[i],z[i],x[i+1],y[i+1],z[i+1]);
        }
        System.out.printf("%.2f",f);
    }
    public static float calc(int x1, int y1, int z1, int x2, int y2, int z2)
    {
        float f = 0.0f;
        if((x1==x2 && y1==y2) || (x1==x2 && z1==z2) || (y1==y2 && z1==z2))
        {
            //f += 1.05f;
            return 1.05f;
        }
        else
        {
            return (float) Math.ceil(Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2) + Math.pow(z2-z1,2)));
            //c += q;
        }

    }
}


/*


Mohamed Aashif <aashifgood3@gmail.com>
2:19 AM (2 minutes ago)
to me

for(i=0;i<n-1;i++)
  {
    q=0;
    if((a[i][0]==a[i+1][0] && a[i][1]==a[i+1][1]) || (a[i][0]==a[i+1][0] && a[i][2]==a[i+1][2]) || (a[i][2]==a[i+1][2] && a[i][1]==a[i+1][1]))
    {
      c=c+1.05;
    }
    else
    {
      q=ceil(sqrt(pow(a[i][0]-a[i+1][0],2)+ pow(a[i][1]-a[i+1][1],2) + pow(a[i][2]-a[i+1][2],2)));
      c=c+q;
    }
  }

3
1,1,10,2,1,10,0,1,9
4.05

3
1,1,10,2,1,10,0,5,9
6.05
 */