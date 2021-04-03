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
public class ques21 {
    public static void unique(String str)
    {
        char arr1[]=str.toCharArray();
        int arr2[]=new int[1000];
       
        
        for(int i=0;i<arr1.length;i++)
        {
            arr2[arr1[i]]=arr2[arr1[i]]+1;
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(arr2[arr1[i]]==1)
            {
                System.out.println(arr1[i]);
                arr2[arr1[i]]=0;
                
            }
        }
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.next();
       unique(str);
    }
}
