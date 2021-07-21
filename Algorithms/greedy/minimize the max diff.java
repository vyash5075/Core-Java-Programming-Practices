//https://www.geeksforgeeks.org/minimize-the-maximum-difference-between-the-heights/
/*
Input  : arr[] = {1, 15, 10}, k = 6
Output :  Maximum difference is 5.
Explanation : We change 1 to 7, 15 to 
9 and 10 to 4. Maximum difference is 5
(between 4 and 9). We can't get a lower
difference.

*/


import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={1,15,10};
        int k=6;
        System.out.println("Maximumdifference is"+getmindiff(arr,arr.length,k));
    }
    
    public static int getmindiff(int arr[],int n,int k){
        if(n==1){
            return 0;
        }
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int small=arr[0]+k;
        int big=arr[n-1]-k;
        int temp=0;
        if(small>big){
            temp=small;
            small=big;
            big=temp;
        }
        for (int i = 1; i < n-1; i ++)
		{
			int subtract = arr[i] - k;
			int add = arr[i] + k;
			if (subtract >= small || add <= big)
				continue;

			if (big - subtract <= add - small)
				small = subtract;
			else
				big = add;
		}

        return Math.min(ans,big-small);
    }
}
