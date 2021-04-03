
package strings;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class ques1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.next();
        int len=str.length();
        char arr[]=new char[len];
        arr=str.toCharArray();
       
        char arr2[]=new char[len];
        int j=0;
        for(int i=0;i<len;i++)
        {
            arr2[i]=arr[len-i-1];
           
        }
        System.out.print(new String(arr2));
              
    }     
}
