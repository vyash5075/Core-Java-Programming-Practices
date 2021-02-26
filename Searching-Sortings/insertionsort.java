/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingsorting;

/**
 *
 * @author yash verma
 */
import java.util.*;
public class insertionsort{
    public static void insertionsort(int arr[],int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i;
           while(j>0&&arr[j-1]>temp){
               arr[j]=arr[j-1];
               j=j-1;
           }
           arr[j]=temp;
               
            }
            
         for(int i=0;i<n;i++){
           System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr,n);
    }
}
