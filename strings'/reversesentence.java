
import java.util.*;
/**
 *
 * @author yash verma
 */
public class ques37 {
    public static void reversesentence(String str)
    {
        String arr[]=str.split("\\.");
        String s="";
        for(int i=arr.length-1;i>=0;i--)
        {
        // System.out.print(arr[i]+".");
         s=s+arr[i]+".";
        }
       
        System.out.print(s);  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String sentence");
        String str=sc.nextLine();
        reverse(str);
    }
}
