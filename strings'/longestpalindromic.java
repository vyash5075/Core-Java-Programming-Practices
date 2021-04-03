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
public class ques36 {
    public static void longestpalindrome(String str)
    {
        int maxlength=1;
        int len=str.length();
        int start=0;
        int low;
        int high;
        for(int i=1;i<len;i++)
        {
            low=i-1;
            high=i;
            while(low>=0&&high<len &&str.charAt(low)==str.charAt(high))
            {
                if(high-low+1>maxlength)
                {
                    start=low;
                    maxlength=high-low+1;
                }
                low--;
                high++;
            }
            low=i-1;
            high=i+1;
            while(low>=0&&high<len&&str.charAt(low)==str.charAt(high))
            {
              if(high-low+1>maxlength)
                {
                    start=low;
                    maxlength=high-low+1;
                }
                low--;
                high++;  
            }
            
        }
        print(str,start,start+maxlength);
    }
    public static void print(String str,int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            System.out.print(str.charAt(i));
        }
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.next();
    longestpalindrome(str);
}
}
