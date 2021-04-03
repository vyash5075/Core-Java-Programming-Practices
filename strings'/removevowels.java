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
public class ques12 {
    public static String removevowels(String str)
    {
        String str2="";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char t=str.charAt(i);
            if (t == 'a' || t == 'A' || t == 'e' || t == 'E' || t == 'i' || t == 'I' || t =='o' || t=='O' || t == 'u' || t == 'U')
            {
                
            }
            else{
               str2= str2.concat(str.charAt(i)+"");
            }
        }
        return(str2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
        System.out.print(removevowels(str));
    }
}
