import  java.util.Scanner;

    public class StringSplit
    {
        public static void main(String args[])
        {
            Scanner S = new Scanner(System.in);
            String a = S.next();
            String b = S.next();
            String c = S.next();
            System.out.println(encodeThreeStrings(a,b,c));
        }

        public static String encodeThreeStrings(String input1,String input2,String input3){
            // Read only region end
            String[] s=new String[3];
            int[] l=new int[3];
            String[] f=new String[3];
            String[] m=new String[3];
            String[] e=new String[3];
            String str1;
            String str2;
            String str3;
            String str3fin = "";
            String fin;
            int i,r,n;
            s[0]=input1;
            s[1]=input2;
            s[2]=input3;
            l[0]=s[0].length();
            l[1]=s[1].length();
            l[2]=s[2].length();
            for(i=0;i<3;i++)
            {
                r=l[i]%3;
                n=l[i]/3;
                if(r==0)
                {
                    f[i]=s[i].substring(0,n);
                    m[i]=s[i].substring(n,2*n);
                    e[i]=s[i].substring(2*n,l[i]);
                }
                else if(r==1)
                {
                    f[i]=s[i].substring(0,n);
                    m[i]=s[i].substring(n,2*n+1);
                    e[i]=s[i].substring(2*n+1,l[i]);
                }
                else
                {
                    f[i]=s[i].substring(0,n+1);
                    m[i]=s[i].substring(n+1,2*n+1);
                    e[i]=s[i].substring(2*n+1,l[i]);
                }
            }
            str1=f[0]+f[1]+f[2];
            str2=m[0]+m[1]+m[2];
            str3=e[0]+e[1]+e[2];
            for(i=0;i<str3.length();i++)
            {
                if(Character.isUpperCase(str3.charAt(i)))
                {
                    str3fin+=Character.toLowerCase(str3.charAt(i));
                }
                else
                {
                    str3fin+=Character.toUpperCase(str3.charAt(i));
                }
            }
            fin = str1+","+str2+","+str3fin;
            //Result R = new Result(str1,str2,str3fin);
            return fin;
        }
    }

