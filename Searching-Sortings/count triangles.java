//  // 2pointer approach
//  input: arr[]={2,4,6,8,9};
//  output: 5

//for triangle formation sum of  sides is greater than third . then add to count.
 

 
import java.util.*;
public class abc{
    public static void main(String args[]){
        int arr[]={2,4,6,8,9};
         
        System.out.println(triplets(arr));
    }
    public static int triplets(int arr[]){
        
        Arrays.sort(arr);
        int count=0;
        for(int i=arr.length-1;i>=2;i--){
            int lo=0;
            int high=i-1;
            
            while(lo<high){
                if(arr[lo]+arr[high]>arr[i]){

                   count+=(high-lo);
                                      high--;
                }
                else{
                    lo++;
                }
            }
            
            
        }
        return count;
    }
    
}
