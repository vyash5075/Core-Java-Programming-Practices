/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingsorting;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class learn {
    public static void bubblesort(String arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }   
        }       
          for(int i=0;i<n;i++)
      {
         System.out.println(arr[i]);
      }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String arr[]=new String[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.next();
        }
      for(int i=0;i<a;i++)
      {
        //  System.out.println(arr[i]);
      }
      bubblesort(arr,a);
    }
    
}
