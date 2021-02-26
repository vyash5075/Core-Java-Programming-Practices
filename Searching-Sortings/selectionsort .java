;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingsorting;
import java.util.Scanner;
/**
 *
 * @author yash verma
 */
public class selectionsort {
    public static void selection(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int small = i;  
            for (int j = i + 1; j < arr.length; j++)
             {  
                if (arr[j] < arr[small]){  
                    small = j;  
                }  
            }  
            int smallerNumber = arr[small];   
            arr[small] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        selection(arr);
         System.out.println("after sorting");
     for(int i=0;i<arr.length;i++)
     {
        System.out.println(arr[i]);
     }
    }
}
