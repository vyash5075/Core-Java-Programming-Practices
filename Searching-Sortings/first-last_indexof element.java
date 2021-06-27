//input: arr[]={1,1,2,2,2,2,3,4};
//output: 2,5
import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={1,1,2,2,2,2,3,4};
        int target=2;
       int a[]= searchindexes(arr,target);
       System.out.println(a[0]+"-"+a[1]);
    }
    public static int[] searchindexes(int arr[],int target){
        
        int ans[]={-1,-1};
        
        int lo=0;
        int high=arr.length-1;
        
        //to find first index
        
        while(lo<=high){
            int mid=(lo+high)/2;
            if(arr[mid]==target){
                 ans[0]=mid;
                 high=mid-1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
        }
        else{
            high=mid-1;
        }
        }
        
        lo=0;
        high=arr.length-1;
        while(lo<=high){
            int mid=(lo+high)/2;
            if(arr[mid]==target){
                 ans[1]=mid;
                 lo=mid+1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
        }
        else{
            high=mid-1;
        }
        }
        return ans;
        
    }
}
