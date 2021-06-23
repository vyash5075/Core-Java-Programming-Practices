import java.util.*;
public class abc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,4,3,7,4,6,1};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
       radixsort(arr);
              
    }
    
    public static void radixsort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
        }
        int exp=1;
        while(exp<=max){
            countsort(arr,exp);
            exp=exp*10;
        }
    }
    public static void countsort(int arr[],int exp){
        
        int farr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            
            farr[arr[i]/exp%10]++;
        }
        for(int i=1;i<farr.length;i++){
            farr[i]=farr[i]+farr[i-1];
        }
        
        int ans[]=new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int pos=farr[arr[i]/exp%10]-1;
            ans[pos]=arr[i];
           farr[arr[i]/exp%10]--;
        }
         for(int i=0;i<ans.length;i++){
             arr[i]=ans[i];
    }
    printarr(arr);
    }
    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"-");
        }
        System.out.println();
    }
    
}
