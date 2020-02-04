/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 * input :2
 *          10
 *          0 1  2  3 4 5   6 7 8 9 10
 *
 * @author yash verma
 */
public class jumping_no {
    public static void jumping(int m)
    {
        for(int i=0;i<=m;i++)
        {int a=0;
        int b=0;
            if(i>=0&&i<=10)
            {
                System.out.println(i);
            }
            
            else if(i>10&&i<=99){
                a=i/10;
                b=i%10;
                if(a-b==-1||a-b==1)
                {
                    System.out.println(i);
                }
            }
            else{
              
                   int arr[]=new int [10];
                   int j=0;
                   int flag=1;
                   int o=i;
                   while(o!=0)
                   {
                       arr[j]=o%10;
                      // arr[j]=a;
                       j++;
                       o=o/10;
                   }
                   for(int k=0;k<j-1;j++)
                   {int x=arr[k];
                   int y=arr[k+1];
                       if(x-y==-1||x-y==1)
                       {
                          flag=1;
                       }
                       else{
                           flag=0;
                       }
                   }
                   if(flag==1)
                   {
                       System.out.println(i);
                   }
               
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rounds");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("enter no. ");
            int m=sc.nextInt();
            jumping(m);
           
        }
    }
}
