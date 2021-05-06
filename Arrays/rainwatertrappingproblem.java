/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author yash verma
 */
import java.util.*;
public class ques84 {
    public static void main(String args[]){
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n=arr.length;
        System.out.println(maxwater(arr,n));
    }
    
    public static int maxwater(int arr[],int n){
        int res=0;
        
        for(int i=0;i<n-1;i++){
            int left=arr[i];
            
            for(int j=0;j<i;j++){
                left=Math.max(left,arr[j]);
            }
            
            int right=arr[i];
            for(int j=i+1;j<n;j++){
                right=Math.max(arr[j],right);
            }
           res+=Math.min(left,right)-arr[i];
        }
        return res;
    }
    
    //-------------------------------------------------------------------------------------------------------
    //optimised approach in O(n)
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author yash verma
 */
import java.util.*;
public class ques84 {
    public static void main(String args[]){
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n=arr.length;
        System.out.println(findwater(arr,n));
    }
    
    public static int findwater(int arr[],int n){
        int left[]=new int[n];
        int right[]=new int[n];
        int water=0;
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1], arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i], right[i+1]);
        }
        for(int i=0;i<n;i++){
            water+=Math.min(left[i],right[i])-arr[i];
        }
        return water;
    }
}

