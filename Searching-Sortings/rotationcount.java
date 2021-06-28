//input : arr[]={4,5,6,7,8,0,1,2}
//output: 5
import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={4,5,6,7,8,0,1,2};
        int a=findminimum(arr);
        System.out.println(a);
    }
    public static int  findminimum(int arr[]){
        
        int lo=0;
        int high=arr.length-1;
        
        while(lo<=high){
            int mid=(lo+high)/2;
            if(arr[mid]<arr[mid-1]){
                return  mid;
            }
            else if(arr[mid]>arr[mid+1]){
             return arr[mid+1];   
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
