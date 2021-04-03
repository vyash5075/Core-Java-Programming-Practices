/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author yash verma
 */
import java.util.*;
public class ques44 {
    public static void conversionsum(String str)
    {
        int sum=0;
        String temp="0";
        
        for(int i=0;i<str.length();i++)
        {
            
            if(!(str.charAt(i)>='a'&&str.charAt(i)<='z'))
            {
                temp=temp+str.charAt(i);
//                System.out.println(temp);
                
            }
            else{
             int a=Integer.parseInt(temp); 
             sum=sum+a;
             temp="0";
            }
        }
        
        System.out.println(sum+Integer.parseInt(temp));
    }
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String str=s.next();
        conversionsum(str);
    }
}