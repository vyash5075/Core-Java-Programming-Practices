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
public class ques24 {
    public static void deleteoccurences(String str,char ch)
    {
        char arr[]=str.toCharArray();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=ch)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        Arrays.copyOf(arr,index);
        String s="";
       for(int i=0;i<index;i++)
       {
           s=s.concat(arr[i]+"");
       }
       System.out.print(s);
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter String");
    String s=sc.next();
    System.out.println("enter character u want to remove all occurences");
    char ch=sc.next().charAt(0);
    deleteoccurences(s,ch);
}
}
