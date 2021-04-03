/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**
 *   input:  "lapqooqpqpl"
 *             p
 * output :    6
 * @author yash verma
 */
public class ques35 {
    public static int search(String str,char ch)
    {
        char arr[]=str.toCharArray();
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==ch)
            {
                return 1;
              
            }
        }
        return -1;
    }
    public static boolean ispalindrome(String str,int i,int j)
    {
       while (i < j) 
		{ 
	if (str.charAt(i) != str.charAt(j)) 
    { 
	return false; 
    } 
	i++; 
	j--; 
} 
    return true; 

    }
    public static int maxlenpalindrome(String str,char ch)
    {
        int len=str.length();
        int maxlength=0;
        String newstring=" ";
       
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)==ch)
            {
                for(int j=len-1;j>=0;j--)
                {
                    if(str.charAt(j)==ch)
                    {
                        if(ispalindrome(str,i,j))
                        {
                            
                             maxlength = Math.max(maxlength, j - i + 1); // to get mamximum value substring
                            break;
                          
                        }
                    }
                }
            }
        }
        return maxlength;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        System.out.println("enter character and it should be present int he string");
        char ch=sc.next().charAt(0);
       int flag= search(str,ch);
        if(flag==1)
        {
            int s=maxlenpalindrome(str,ch);
            //System.out.println("length of the palindrome substring is"+s.length());
            System.out.println(s);
        }
        else{
            System.out.println("invalid character");
        }
    }
}
