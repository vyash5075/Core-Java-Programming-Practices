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
        countsort(arr,min,max);
         
   //   System.out.println(Arrays.toString(arr));
         
    }
    
    public static void countsort(int arr[],int min,int max){
        int range=max-min+1;
        int farr[]=new int[range];
        for(int i=0;i<arr.length;i++){
            int idx=arr[i]-min;
            farr[idx]++;
        }
        for(int i=1;i<farr.length;i++){
            farr[i]=farr[i]+farr[i-1];
        }
        
        int ans[]=new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
            int pos=farr[val-min]-1;
            ans[pos]=arr[i];
           farr[val-min]--;
        }
         for(int i=0;i<ans.length;i++){
             System.out.println(ans[i]);
    }
    }
    
}
