
//max frequenxy character



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
public class ques19 {
       public static void maxfrequency(String str)
    {
        char arr[]= str.toCharArray();
        int arr2[]=new int[62];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                 arr2[arr[i]-71]++;
            }
            if(arr[i]>='A' && arr[i]<='Z')
            {
                 arr2[arr[i]-65]++;
            }
           if(arr[i]>='1' && arr[i]<='9')
            {
                 arr2[arr[i]+5]++;
            }
        }
        System.out.println("max frequency  element is");
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {     
            if(arr2[arr[i]]>max&&arr2[arr[i]]!=0)
            {
                max=arr2[arr[i]];
                index=i;
                
            }
             
        }
        System.out.println(arr[index]+":"+arr2[arr[index]]);
              //  arr2[arr[i]]=0;   
    }
            public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter String");
        String str=sc.next();
       maxfrequency(str);
    } 
}


------------------------------------------------------------------------------
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
public class MaxElement {
    
    public static void max(String str)
    {
        char arr[]=str.toCharArray();
        int arr2[]=new int[100];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='a'&&arr[i]<='z')
                
            {
                arr2[arr[i]-71]++;
            }
           else if(arr[i]>='A'&&arr[i]<='Z')
            {
                arr2[arr[i]-65]++;
            }
           else if(arr[i]>='1'&&arr[i]<='9')
            {
             arr2[arr[i]+5]++;   
            }  
        }
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>='a'&&arr[i]<='z')
           {
               if(arr2[arr[i]-71]>max&&arr2[arr[i]-71]!=0)
               {
                   max=arr2[arr[i]-71];
                   index=i;
               }
           }
           else if(arr[i]>='a'&&arr[i]<='z')
           {
               
               if(arr2[arr[i]-65]>max&&arr2[arr[i]-65]!=0)
               {
                   max=arr2[arr[i]-65];
                   index=i;
               }
               
           }
           else  if(arr[i]>='0'&&arr[i]<='9')
            {
             if(arr2[arr[i]+5]>max&&arr2[arr[i]+5]!=0)
             {
                 max=arr2[arr[i]+5];
                 index=i;
             }
            }
           }
        
        System.out.println( arr[index]+"commes"+max +"times");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        max(s);
 
    }
}

