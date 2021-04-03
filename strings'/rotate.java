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
public class ques29 {
     public static void rotate(String str,int rounds)
            {
                char arr[]=str.toCharArray();
                int l=arr.length-1;
                for(int i=0;i<rounds;i++)
                {
                    char temp=arr[arr.length-1];
                    for(int j=l;j>=1;j--)
                    { 
                     arr[j]=arr[j-1];   
                    }
                    arr[0]=temp;
                }
                for(int i=0;i<arr.length;i++)
                {
                    System.out.println(arr[i]);
                }
                
            }
    public static void main(String args[])
           
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
       System.out.println("enter the rotation rounds");
       int rounds=sc.nextInt();
           rotate(str,rounds);
       
      
    }
}
