/*
Input : arr[] = {3, 1, 7, 1}
Output : 1
Smallest subset is {7}. Sum of
this subset is greater than all
other elements {3, 1, 1}

Input : arr[] = {2, 1, 2}
Output : 2
In this example one element is not 
enough. We can pick elements with 
values 1, 2 or 2, 2. In any case, 
the minimum count is 2.
 
*/

import java.util.*;
public class abc{
    public static void main(String args[]){
        int arr[]={3,1,7,1};
        int n=arr.length;
        System.out.println( minElements(arr,n));
    }
    public static int minElements(int arr[],int n){
        int halfSum=0;
        for(int i=0;i<n;i++){
            halfSum=halfSum+arr[i];
            
        }
        halfSum=halfSum/2;
        Arrays.sort(arr);
        int res=0;
        int cursum=0;
       for (int i = n-1; i >= 0; i--) {
     
            cursum += arr[i];
            res++;
     
            
            if(cursum>halfSum){
                return res;
            }
        }
        return res;
    }
}
