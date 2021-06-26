import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[][]={{1,3,5,7,9},
                     {10,20,25,29,34},
                     {38,40,44,49,53},
                     {60,61,65,68,74},
                     {78,80,85,90,92}
            
        };
        int target=65;
        
        boolean isfound=search(arr,target);
         System.out.println(isfound);
    }
   
    
    public static boolean search(int matrix[][],int target){
        int r=binarysearchrowselect(matrix,target);
        if(r==-1){
            return false;
        }
        boolean isFound=binarysearch(matrix,r,target);
        
        return isFound;
    }
    
    public static int binarysearchrowselect(int matrix[][],int target){
        int low=0;
        int high=matrix.length-1;
        int lastcol=matrix[0].length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid][0]<=target&&target<=matrix[mid][lastcol]){
                return mid;
            }
            else if(matrix[mid][0]<target){
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    
    public static boolean binarysearch(int matrix[][],int r ,int target){
        int low=0;
        int high=matrix[0].length-1;
        while(low<=high){
            int mid=low+high/2;
            if(matrix[r][mid]==target){
                return true;
            }
            else if(target<=matrix[r][mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
