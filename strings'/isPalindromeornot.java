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
public class ques3 {
    public static int  palindrome(String str)
    {
        int flag=1;
        int len=str.length();
        char arr[]=new char[len];
        arr=str.toCharArray();
        for(int i=0;i<len;i++)
        {
            if(arr[i]==arr[len-i-1])
            {
                
            }
            else{
                flag=0;
               return flag;
               
            }
        }
       return flag;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
       int flag= palindrome(str);
      if(flag==0)
      {
          System.out.println("not palindrome");
      }
      else{
         System.out.println("palindrome");   
      }
    }
}
