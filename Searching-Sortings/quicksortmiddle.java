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
public class quicksortmiddle {
    int partition(int ar[],int low,int high)
    {
        int pivot=ar[(low+high)/2];
        while(low<=high)
        {
            while(ar[low]<pivot)
            {
                low++;
            }
            while(ar[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp=ar[low];
                ar[low]=ar[high];
                ar[high]=temp;
                low++;
                high--;
            }
        }
        return low;
        }
    void sortrecursion(int ar[],int low,int high)
    {
        int pi=partition(ar,low,high);
        if(low<pi-1)
        {
            sortrecursion(ar,low,pi-1);
        }
        if(pi<high)
        {
            sortrecursion(ar,pi,high);
        }
    }
    public void printarray(int ar[])
    {
      for  (int i=0;i<ar.length;i++)
      {
          System.out.println("sorted"+ar[i]);
      }
    }
    public static void main(String args[])
    {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int length=ar.length;
        quicksortmiddle q=new quicksortmiddle();
        q.sortrecursion(ar,0,length-1);
        q.printarray(ar);
    }
}

