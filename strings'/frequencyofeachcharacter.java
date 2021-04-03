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
public class ques18 {
   public static void frequency(String str)
    {
        char arr[]= str.toCharArray();
        int arr2[]=new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            arr2[arr[i]]=arr2[arr[i]]+1;
        }
        System.out.println("unique elements are");
        for(int i=0;i<arr.length;i++)
        {
            if(arr2[arr[i]]>=1)
            {
                System.out.println(arr[i]+":"+arr2[arr[i]]);
                arr2[arr[i]]=0;
            }
        }
    }
            public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter String");
        String str=sc.next();
        frequency(str);
    } 
}
-----------------------------------------------------------------------------------