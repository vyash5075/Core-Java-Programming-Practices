/*
 yas
y
ya
yas
a
as
s
 */
package strings;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class ques30 {
    public static void subsets(String str)
    {
        char arr[]=str.toCharArray();
        char max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.println("");
            }   
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        subsets(str);
    }