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
public class armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        int temp2=n;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
       int total=0;
       int ind;
       while(n>0)
       {
           int t=count;
           int rem=n%10;
            ind=1;
           while(t!=0)
           {
               ind=ind*rem;
               t--;
           }
           total=total+ind;
           n=n/10;
       }
       if(temp2==total)
       {
           System.out.println("no. is armstrong");
           
       }
       else{
           System.out.println("no. is not armstrong");
       }
    }
}
