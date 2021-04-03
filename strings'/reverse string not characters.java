/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class ques37 {
    public static void reverse(String str)
    {
        String arr[]=str.split("\\.");
        String s="";
        for(int i=arr.length-1;i>=0;i--)
        {
         System.out.print(arr[i]+".");
         s=s+arr[i]+".";
        }
       
      //  System.out.print(s);  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
        reverse(str);
    }
}
