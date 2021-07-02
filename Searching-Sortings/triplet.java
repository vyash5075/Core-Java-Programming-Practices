 // 2pointer approach
 input: arr[]={1,2,3,4,5,7};
 output: 6
 
 explanation: 
3-4-7
4-3-7
2-3-5
3-2-5
2-2-4
2-1-3
 
 
import java.util.*;
public class abc{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,7};
         
        System.out.println(triplets(arr));
    }
    public static int triplets(int arr[]){
        
        Arrays.sort(arr);
        int count=0;
        for(int i=arr.length-1;i>=2;i--){
            int lo=0;
            int high=i-1;
            
            while(lo<high){
                if(arr[lo]+arr[high]==arr[i]){
                    lo++;
                    high--;
                    count++;
                    System.out.println(arr[lo]+"-"+arr[high]+"-"+arr[i]);
                }
                else if(arr[lo]+arr[high]<arr[i]){
                    lo++;
                }
                else{
                    high--;
                }
            }
            
            
        }
        return count;
    }
    
}
