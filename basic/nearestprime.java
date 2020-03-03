/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class nearestprime {
    public static int isprime(int n)
    {
        int flag=0;
         int m=n/2;
        if(n==0||n==1)
        {
           flag=1;
        }
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
        }
       return flag;
    }   
        
    public static void main(String args[])
    {
  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=n-10;
        for(int i=n;;i--)
        {
            int a=isprime(i);
            if(a==0)
            {
                System.out.println(i+"is nearest");
                break;
            }
            else{
                
            }
        }
         for(int i=n;;i++)
        {
            int a=isprime(i);
            if(a==0)
            {
                System.out.println(i+"is nearest");
                break;
            }
            else{
                
            }
        }
    }   
}
