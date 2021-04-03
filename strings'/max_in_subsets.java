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

public class ques31 {
    public static void subarray(String str,int n)
    {
        char []arr=str.toCharArray();
        int len=arr.length;
        char maxx=arr[0];
        for(int i=0;i<len;i++)
        {
           if(arr[i]>maxx)
           {
               maxx=arr[i];
           }
        }
        System.out.println("kln+"+maxx);
        for(int i=0;i<=len-n;i++)
        {  char max=arr[i];
            for(int j=i;j<i+n;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }       
            }
             System.out.print(max+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine();
        System.out.println("enter the size of subarray");
        int n=sc.nextInt();
        subarray(str,n);
    }
}
