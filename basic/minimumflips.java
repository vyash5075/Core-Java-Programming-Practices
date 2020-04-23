/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeeks;
import java.util.*;
/**
 *
 7 10
binary of 7 111
binary of 10 1010
xor of 111 and 1010 = 1101
minimum flips3
 */
public class minimumflips {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String arr[]=s.trim().split("\\s+");
//        System.out.println(arr[0]);
        int a=Integer.parseInt(arr[0]);
         String s2=Integer.toBinaryString(a);
         System.out.println("binary of "+a+" "+s2); 
        int b=Integer.parseInt(arr[1]);
        String s3=Integer.toBinaryString(b);
         System.out.println("binary of "+b+" "+s3); 
        int c=a^b;
       String s1=Integer.toBinaryString(c);
        System.out.println( "xor of "+s2+" and "+s3+" = "+s1);
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
           if(s1.charAt(i)=='1')
           {
               count++;
           }
        }
        System.out.println("minimum flips"+count);
    }
}
