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
public class spiralmatrix {
    public void spiral(int m,int n,int arr[][])
    {
     int k=0,l=0;
     int lastrow=m-1;
     int lastcol=n-1;
     while(k<=lastrow&&l<=lastcol)
     {
         for(int i=l;i<=lastcol;i++)
         {
             System.out.println(arr[k][i]);
         }
             k++;
             for(int i=k;i<=lastrow;i++)
             {
                 System.out.println(arr[i][lastcol]);
             }
                 lastcol--;
             
             if(k<=lastrow)
             {
                 for(int i=lastcol;i>=l;i--)
                 {
                     System.out.println(arr[lastrow][i]);
                 }
                     lastrow--;
                 }
                 if(l<=lastcol)
                 {
                     for(int i=lastrow;i>=k;i--)
                     {
                         System.out.println(arr[i][l]);
                     }
                     l++;
             }
         }
     }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int m=sc.nextInt();
        System.out.println("enetr the no, pof columns");
        int n=sc.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            
        }
        spiralmatrix s=new spiralmatrix();
        System.out.println("element in spiral ");
        s.spiral(m,n,arr);
    }
}
