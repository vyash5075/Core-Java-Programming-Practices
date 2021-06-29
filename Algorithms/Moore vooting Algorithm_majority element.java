ques find the majority element whose frequency is more than equal to arr.length/2;

optimed approach:   space complexity: O(1)
                    time complexity:  O(n)

import java.util.*;
public class abc{
    public static void main(String args[]){
        int arr[]={1,2,1,3,1,4,1};
        printmajority(arr);
    }
    public static void printmajority(int arr[]){
        
        int value=valid(arr);
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value)count++;
        }
        
        if(count>=arr.length/2){
            System.out.println(value+" is majority element");
        }
        else{
            System.out.println("No majority element");
        }
    }
    
    public static int valid(int arr[]){
        int val=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(val==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                val=arr[i];
                count=1;
                
            }
        }
        return val;
    }
}
