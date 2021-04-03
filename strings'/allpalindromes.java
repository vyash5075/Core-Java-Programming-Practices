
package strings;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class ques42 {
    static List<String>l=new ArrayList<>();
    
    public static void getpalindrome(String str,int length)
    {
        for(int i=0;i<=length;i++)
        {
            for(int j=i;j<=length;j++)
            {
                String s=str.substring(i,j);
               int status= checkpalindrome(s);
               if(status==1)
               {
                   l.add(s);
               }
            }
        }
    }
    public static int checkpalindrome(String str)
    {
        int flag=0;
        int n=str.length();
       if(str.length()==1)
               {
                   return 1;
               }
       else{
           int mid=n/2;
           for(int i=0;i<mid;i++)
           {
               if(str.charAt(i)==str.charAt(n-i-1))
               {
                   flag=1;
               }
               else{
                   return 0;
               }
           }
       }
       return flag;
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter String");
        String s=sc.next();
        int n=s.length();
        getpalindrome(s,n);
        System.out.println(l);
    }
}
