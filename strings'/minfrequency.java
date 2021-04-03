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
public class ques20 {
    public static void minfrequency(String str)
    {
        char arr1[]=str.toCharArray();
        int arr2[]=new int[1000];
        int min=999;
        int index=0;
        
        for(int i=0;i<arr1.length;i++)
        {
            arr2[arr1[i]]=arr2[arr1[i]]+1;
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(arr2[arr1[i]]<min)
            {
                min=arr2[arr1[i]];
                index=i;
            }
        }
        System.out.println(arr1[index]+":"+arr2[arr1[index]]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.next();
        minfrequency(str);
    }
}