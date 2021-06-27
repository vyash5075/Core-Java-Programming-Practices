//input : arr[]=4,5,6,7,8,9,10,1,2, target=1
//output: 7

//source: https://www.youtube.com/watch?v=1uu3g_uu8O0&list=PL-Jc9J83PIiHhXKonZxk7gbEWsmSYP5kq&index=14
import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={4,5,6,7,8,9,10,1,2};
        int target=1;
         int a= find(arr,target);
       System.out.println(a);
    }
    public static int  find(int arr[],int target){
        
        int lo=0;
        int high=arr.length-1;
        
        while(lo<=high){
            int mid=(lo+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[lo]<=arr[mid]){
               //lo to mid part is sorted
               if(target>=arr[lo]&&arr[mid]<target)
               {
                   high=mid-1;   
               }else{
                   lo=mid+1;
               }
            }
            else if(arr[mid]<=arr[high]){
                if(target>arr[mid]&&arr[high]>target){
                    lo=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
