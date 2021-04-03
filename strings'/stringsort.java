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
public class ques14 {
    public static String sort(String s)
    {
        char arr[]=s.toCharArray();
       Arrays.sort(arr);
       String str=new String(arr);
       return str;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.nextLine();
         System.out.print(sort(s));
    }
}
-------------------------------------------------------------------
//way2
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
public class ques15 {
    public static String sort(String s)
    {
        char arr[]=s.toCharArray();
       
        for(int i=0;i<arr.length;i++)
        { 
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;    
                }
            }
            
        }
        String st=new String(arr);
        return st;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.nextLine();
        System.out.print(sort(s));
    }
}
