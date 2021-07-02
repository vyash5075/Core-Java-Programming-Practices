/*Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].

Example 1:

Input:
m = 6, n = 6
arr1[] = {1,2,3,4,7,9}
arr2[] = {0,1,2,1,1,4}
Output: 4 5 5 6 6 6
Explanation: Number of elements less than
or equal to 1, 2, 3, 4, 7, and 9 in the
second array are respectively 4,5,5,6,6,6
*/


import java.util.*;
public class abc{
    public static void main(String args[]){
        int arr1[]={1,2,3,4,7,9};
        int arr2[]={0,1,1,1,2,4};
        
        find(arr1,arr2);
        
    }
    
    public static void find(int arr1[],int arr2[]){
        Arrays.sort(arr2);
        int ans[]=new int[arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            int key=arr1[i];
            int cs=helper(arr2,key);
            
            ans[i]=cs;
        }
         for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    
    public static int helper(int arr2[],int key){
        int count=0;
        
        int lo=0;
        int hi=arr2.length-1;
      
        while(lo<=hi){
              int mid=(lo+hi)/2;
            if(arr2[mid]<=key){
                count+=(mid-lo+1);
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return count;
    }
}
