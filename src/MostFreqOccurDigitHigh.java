public class MostFreqOccurDigitHigh {
}


//import java.io.*;
//        import  java.util.*;
//
//// Read only region start
//class UserMainCode
//{
//
//    public int mostFrequentlyOccurringDigit(int[] input1,int input2){
//        // Read only region end
//        int d =0;
//        char cc='\0';
//        char ch='\0';
//        int max=0,ma=-0;
//        String st = "";
//        for(int i=0;i<input2;i++)
//        {
//            st += input1[i];
//        }
//		/*String input11 = String.valueOf(input1[0]);
//		String input22 = String.valueOf(input1[1]);
//		String input3 = String.valueOf(input1[2]);
//		String input4 = String.valueOf(input1[3]);
//        String st = input11+input22+input3+input4;*/
//        //int[] c = new int[st.length()];
//        TreeSet<Character> ts = new TreeSet<Character>(Collections.reverseOrder());
//        for(int i=0;i<st.length();i++)
//        {
//            ts.add(st.charAt(i));
//        }
//        //System.out.print(ts);
//        Iterator<Character> i = ts.iterator();
//        while(i.hasNext())
//        {
//            cc=i.next();
//            ma=0;
//            for(int j=0;j<st.length();j++)
//            {
//                if(cc==st.charAt(j))
//                {
//                    ma++;
//                }
//            }
//            if(ma>max)
//            {
//                max = ma;
//                ch = cc;
//            }
//        }
//        d = Character.getNumericValue(ch);
//        return d;
//
//
//    }
//}
//
