
package strings;
import java.lang.*;
import java.util.Scanner;
/**
 *
 *             // if we use string buffer it does not reverse character after space "yash verma"   output=hsay
 *            // thats why we use string builder
 */
public class ques2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
       String str="yash verma";
       StringBuilder str2=new StringBuilder();
       str2.append(str);
       str2=str2.reverse();
       System.out.print(str2);
    
    
}
}