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
public class ques27 {
    public static void pairs(String str,int n)
    {
        char arr[]=str.toCharArray();
        int length=arr.length-n;
        for(int i=0;i<=length;i++)
        {
            String st="";
            n=n+i;
            for(int j=i;j<n;j++)
            {
                st=st.concat(arr[j]+"");
            }
            System.out.println(st);
            
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        System.out.println("enter the size of each pair");
        int n=sc.nextInt();
        int len=str.length();
        if(n<len)
        {
          pairs(str,n);  
        }
        else{
            System.out.println("you entered a  wrong value !please enter again");
        }   
    }
}
