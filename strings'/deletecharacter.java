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
public class ques22 {
    public static void delete (String str,char ch)
    {
        char arr1[]=str.toCharArray();
        int len=arr1.length;
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==ch)
            {
                for(int j=i;j<arr1.length-1;j++)
                {
                    arr1[j]=arr1[j+1];
                }
                count++;
                break;
            }
        }
        
        if(count==0)
          {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element deleted successfully");
        }
        System.out.println("new array is");
        for(int i=0;i<arr1.length-1;i++)
        {
            System.out.println(arr1[i]);
        }
            
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println("enter the element u want to delete");
        char ch=sc.next().charAt(0);

        delete(str,ch);
    }
}
