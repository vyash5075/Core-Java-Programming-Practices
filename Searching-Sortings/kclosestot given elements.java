
input: 10,20,30,40,50
k=30;x=45;
output: 30,40,50

//approach: binary search
import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={10,20,30,40,45,50};
        int x=45;
        int k=3;
        System.out.println(kclosest(arr,k,x));
    }
    
    public static ArrayList<Integer>kclosest(int arr[],int k,int x){
        int lo=0;
        int high=arr.length-1;
        int mid=0;
        while(lo<=high){
            mid=(lo+high)/2;
            if(x==arr[mid]){
                break;
            }
            else if(arr[mid]<x){
                lo=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        int l=mid-1;
        int r=mid;
        ArrayList<Integer>list=new ArrayList<Integer>();
        
        
        while(l>=0&&r<arr.length&&k>0){
            if(Math.abs(arr[l]-x)<=Math.abs(arr[r]-x)){
                list.add(arr[l]);
                l--;
            }
            else{
                list.add(arr[r]);
                r++;
            }
            k--;
        }
        
        while(k>0&&l>=0){
            list.add(arr[l]);
            l--;
            k--;
            
        }
        while(k>0&&r<arr.length){
            list.add(arr[r]);
            r++;
            k--;
        }
        return list;
    }
}
