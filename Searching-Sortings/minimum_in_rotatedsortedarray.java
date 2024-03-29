//input : arr[]=4,5,6,7,8,9,10,1, 
//output: 1
//source: https://www.youtube.com/watch?v=Kcj2NGnuSNg&list=PL-Jc9J83PIiHhXKonZxk7gbEWsmSYP5kq&index=15

import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={4,5,6,7,8,9,10,1,2};
        int a=findminimum(arr);
        System.out.println(a);
    }
    public static int  findminimum(int arr[]){
        
        int lo=0;
        int high=arr.length-1;
        if(arr[lo]<=arr[high]){
            return arr[lo];
        }
        while(lo<=high){
            int mid=(lo+high)/2;
            
              if(arr[mid]>arr[mid+1]){
             return arr[mid+1];   
            }
            
            else if(arr[mid]<arr[mid-1]){
                return arr[mid];
            }
           
            
            
            else if(arr[lo]<=arr[mid]){
                lo=mid+1;
            }
            else if(arr[mid]<=arr[high]){
                high=mid-1;
            }
        }   
        return -1;
        
    }
}
