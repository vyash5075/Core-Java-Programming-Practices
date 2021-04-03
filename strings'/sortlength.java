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
public class ques34 {
    public static void sortlength(String s)
    {
        String arr[]=s.split(" ");
               Arrays.sort(arr);

      //  System.out.println("dnhfvkj");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
            if(arr[j].length()<arr[i].length())
            {
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        String st="";
            for(int i=0;i<arr.length;i++)
                   {
                       
                     st= st.concat(arr[i]+" ");
                   }       

System.out.println(st);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  string");
        String s=sc.nextLine();
        sortlength(s);
    }
}
