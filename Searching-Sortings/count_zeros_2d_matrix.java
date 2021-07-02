 

//count zeros in 2d sorted matrix

//tip: matrix is sorted row wise as well as column wise.
 

 
import java.util.*;
public class abc{
    public static void main(String args[]){
        int arr[][]={{0,0,0,1,1},{0,0,0,1,1},{0,0,1,1,1},{0,1,1,1,1},{0,1,1,1,1}};
        System.out.println(countzeros(arr));
    }
    public static int countzeros(int arr[][]){
        int count=0;
        int i=0;
        int j=arr.length-1;
        int n=arr.length;
        
        while(i<n&&j>=0){
            if(arr[i][j]==1){
                j--;
            }
            else{
                count+=(j+1);
                i++;
            }
        }
        return count;
        
    }
    
    
}
