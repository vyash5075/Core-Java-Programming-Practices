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
public class primeno {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        int m=n/2;
        if(n==0||n==1)
        {
            System.out.println("mot prime");
        }
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        }
        else{
             System.out.println(" not prime");
        }
    }
}
