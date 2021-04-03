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
public class ques39 {
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
    public static void makepalindrome(String str)
    { 
         for(int i=0;i<str.length();i++)
         {
             int j=0;
             
             char arr[]=new char[str.length()];
             for(int k=0;k<str.length();k++)
             {
                 if(k==i)
                 {
                     
                 }
                 else{
                     arr[j]=str.charAt(k);
                     j++;
                 }  
             }            
             int ln=arr.length-1;
             int flag=0;
             for(int t=0;t<ln;t++)
             {
                 if(arr[t]==arr[ln-t-1])
                 {
                       flag=1;
                 }
                 else{
                     flag=0;
                     break;
                 }
             }
             if(flag==1)
             {
                 System.out.println(new String(arr));
             }  
         }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        int flag=palindrome(str);
        if(flag==0)

        {
            makepalindrome(str);
        }
        else{
            System.out.println("palindrome");
        }
    }
}
