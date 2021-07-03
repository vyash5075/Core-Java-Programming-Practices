import java.util.*;
public class floorceil{
    public static class Pair{
        int justsmall=-1;
        int justlarge=-1;
        Pair(int justsmall,int justlarge){
            this.justsmall=justsmall;
            this.justlarge=justlarge;
        }
        Pair(){
            this.justsmall=-1;
            this.justlarge=-1;
        }
    }
    public static void main(String args[]){
        int arr1[]={2,3,4,9,1};
        int arr2[]={1,8,5};
        ceilfloor(arr1,arr2);
    }
    
    public static void ceilfloor(int arr1[],int arr2[]){
        Arrays.sort(arr2);
        
        
        for(int i=0;i<arr1.length;i++){
            int item=arr1[i];
            Pair p=binarySearch(arr2,item);
            System.out.println("ceil value of "+arr1[i]+" is "+ p.justsmall+" and "+ "floor is"+p.justlarge);
        }
    }
public static Pair binarySearch(int arr[],int item){
    int lo=0;
    int hi=arr.length-1;
    Pair p=new Pair();
    while(lo<=hi){
        int mid=(lo+hi)/2;
        
        if(arr[mid]==item){
            p.justsmall=arr[mid];
            p.justlarge=arr[mid];
            break;
        }
        else if(arr[mid]<item){
            p.justsmall=arr[mid];
            lo=mid+1;
        }
        else{
            p.justlarge=arr[mid];
            hi=mid-1;
        }
    }
    return p;
}    
    
    
}
