 //input :-3,-3,-2,-1,1,3,4,5,5
 //output 5
 //source: https://practice.geeksforgeeks.org/problems/distinct-absolute-array-elements4529/1
 /*explanation: Input:
N = 6
Arr[] = {-3, -2, 0, 3, 4, 5}
Output: 5
Explanation: There are 5 distinct absolute 
values i.e. 0, 2, 3, 4 and 5.
*/

import java.util.*;
public class abc{
    public static void main(String args[]){
        int arr[] ={-3,-3,-2,-1,1,3,4,5,5};
         System.out.println(distinctcount(arr));
        
    }
    public static int distinctcount(int arr[]){
        
        int i=0;
        int j=arr.length-1;
        int prev=Integer.MIN_VALUE;
        int next =Integer.MAX_VALUE;
        int count=0;
        
        while(i<=j){
        if(Math.abs(arr[i])==Math.abs(arr[j])){
            if(arr[i]!=prev&&arr[j]!=next){
                count++;
            }
            prev=arr[i];
            next=arr[j];
            i++;
            j--;
            
        }
         else if(Math.abs(arr[i])<Math.abs(arr[j])){
           
            if(next!= arr[j]){
                count++;
               
            }
             next= arr[j];
             j--;
        }
        else if(Math.abs(arr[i])>Math.abs(arr[j])){
           if(prev!= arr[i]){
                count++;
                
            }
            prev= arr[i];
             i++; 
        }
        
        }
        return count;
    } 
    
     
     
}
