/*

//https://www.geeksforgeeks.org/minimum-difference-between-groups-of-size-two/
Input : arr[] = {2, 6, 4, 3}
Output : 1
Groups formed will be (2, 6) and (4, 3), 
the difference between highest sum group
(2, 6) i.e 8 and lowest sum group (3, 4)
i.e 7 is 1
*/

import java.util.*;
public class abc{
    public static void main(String args[]){
        int arr[]={2,4,3,6};
        System.out.println(calculate(arr));
    }
    
    public static int calculate(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int k=arr[i]+arr[j];
            max=Math.max(max,k);
            min=Math.min(min,k);
            i++;
            j--;
        }
        return max-min;
    }
}
