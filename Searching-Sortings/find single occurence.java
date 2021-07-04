//ques find the element that appears once in an sorted array  . and rest all other elements appear twice
/*N = 11
arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
Output: 4
Explanation: 4 is the only element that 
appears exactly once.
*/


import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={1,1,2,2,4,6,6,8,8,9,9};
        System.out.println(findindex(arr));        
    }
    public static int findindex(int arr[]){
      
        int n=arr.length;
        if(arr.length==1){
            return arr[0];
        }
      else  if(arr[0]!=arr[1]){
            return arr[0];
        }
       else if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
          int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid]==arr[mid-1]){
                int lc=mid-lo+1;
                
                if(lc%2==0){
                    lo=mid+1;
                }
                else{
                    hi=mid-2;
                }
            }
            else if(arr[mid]==arr[mid+1]){
               int rc=hi-mid+1;
               if(rc%2==0){
                   hi=mid-1;
               }
               else{
                   lo=mid+2;
               }
            }
        }
        return -1;
        
    }
}
