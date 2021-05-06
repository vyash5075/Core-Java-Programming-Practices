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
