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
public class maxsubarrayaverage {
    public static double largestsum(int arr[],int k)
    {
     int n=arr.length;
     
     double arr2[] = new double[n + 1]; 
	arr2[0] = 0; 
//     for (int i = 0; i < n; i++) 
//        ;
     for(int i=0;i<n;i++)
     {
         arr2[i + 1] = arr2[i] + arr[i];
//         arr2[i+1]=arr2[i]+arr[i];     //this array is for storing the previous sum till ith position
     }
     
     double average[]=new double[n];         //   for storing the average upto ith term
    
     for(int i=0;i<n;i++)
     {
         average[i]=(arr2[n]-arr2[i])/(n-i);
     }
     
     
     for(int i=0;i<n;i++)
     {
         System.out.println(average[i]+"");
            }
     
     for (int z = 0; z < k- 1; z++)   
     {
         // creating partitions
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++)  
            {
                double p=average[i];
                average[i] = Math.max(average[i], ((arr2[j] - 
                        arr2[i]) / (j - i)) + average[j]); 
               
     System.out.println("averge[i]="+p+" arr2[j] "+arr2[j]+" arr[i] "+arr2[i]+" j-i "+(j-i)+ " average [j]"+average[j]+   "------->"+  average[i]+"");
            }
              System.out.println("----------------------------------------------------------------------");
        }
        System.out.println("partition partition partition partition partition partition partition partition ");
        }
     return average[0];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//      int arr[]={3,5,2,7,9,13,34,23,11,6};
      int arr[]={9,1,2,3,9};
        int k=3;
        
        System.out.println(largestsum(arr,k));
    }
}
