import java.util.*;
public class bubblesortrecursive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,4,3};
         bsortrecursive(arr,arr.length);
      System.out.println(Arrays.toString(arr));
         
    }
    
    public static void bsortrecursive(int arr[],int len){
        if(len==1)return;
        
        for(int i=0;i<len-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bsortrecursive(arr,len-1);
    }
    
    
    
}
