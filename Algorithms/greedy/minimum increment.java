/*
//https://www.geeksforgeeks.org/minimum-increment-k-operations-make-elements-equal/

Minimum increment by k operations to make all elements equal

Input : arr[] = {4, 7, 19, 16},  k = 3
Output : 10

*/


import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={21,33,9,45,63};
        int n=arr.length;
        int k=6;
        System.out.println(minops(arr,n,k));
    }
    
    public static int minops(int arr[],int n,int k){
        Arrays.sort(arr);
        int max=arr[n-1];
        int res=0;
        for(int i=0;i<n;i++){
            if((max-arr[i])%k!=0)
            return -1;
            
            else{
                res+=(max-arr[i])/k;
            }
        }
        return res;
    }
}
