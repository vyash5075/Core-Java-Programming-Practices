/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;
import java.util.*;
/**
 *       total ways to reach from 1 point to another
 * @author yash verma
 */
public class totalways {
    public static void path(int x,int y)
    {
        int arr[][]=new int [x+1][y+1];
        for(int i=0;i<=x;i++)
        {
            arr[i][0]=1;
        }
        for(int i=0;i<=y;i++)
        {
            arr[0][i]=1;
        }
       
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                arr[i][j]=arr[i][j-1]+arr[i-1][j];
            }
        }
        System.out.println("no.of ways are"+arr[x-1][y-1]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the destination coordinates");
        int x=sc.nextInt();
        int y=sc.nextInt();
        path(x,y);
//        System.out.println(arr[2][3]);
    }
}
