    package strings;
    /*
    input 1,2,3,4,5,7,2,4,9
            4
    output 3
    
    input 2
    output 211121112
    
    input 3
    output 321112111232111211123
    */
    import java.util.*;
    public class newbie {
        public static void main(String args[]){
            int arr[]={1,2,3,4,5,7,2,4,9};
          int data=  4;
          System.out.print(firstoccurence(arr,0,data));
          
        }
        public static int firstoccurence(int arr[],int idx,int x){
            if(idx==arr.length){
                return -1;
            }
            if(arr[idx]==x){
                return idx;
            }
            else{
               int fisa= firstoccurence(arr,idx+1,x);
               return fisa;
            }
           
          
        }
    }
