/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class fibonacci {
  
    public static  void fibonacci( int arr[],int n)
    {
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++)
        {
           arr[i]=arr[i-1]+arr[i-2];
        }
       //display 
      for(int i=0;i<n;i++)
      {
          System.out.println(arr[i]);
      }  
    }  
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        fibonacci(arr,n);
        
    }
}
