import java.util.*;
public class insertionsortrecursive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,4,3};
        insertionsortrecursive(arr,arr.length);
      System.out.println(Arrays.toString(arr));
         
    }
    
    public static void insertionsortrecursive(int arr[],int len){
        if (len<= 1)
            return;
            
           insertionsortrecursive(arr,len-1);
           
           int last= arr[len-1];
           int j=len-2;
           while(j>=0&&arr[j]>last){
               arr[j+1]=arr[j];
               j--;
           }
           
        arr[j+1]=last;
    }
    
    
    
}
