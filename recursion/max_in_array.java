    package strings;
    /*
    input 1,2,3,4,5
    output 5
    
    
    */
    import java.util.*;
    public class newbie {
        public static void main(String args[]){
            int arr[]={1,2,3,4,5};
          int m=  max(arr,0);
          System.out.println(m);
        }
        public static int max(int arr[],int idx){
            if(idx==arr.length-1){
                return arr[idx];
            }
           int misa=max(arr,idx+1);
           if(misa>arr[idx]){
               return misa;
           }
           else{
               return arr[idx];
           }
        }
    }
