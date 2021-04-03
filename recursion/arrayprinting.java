    package strings;
   
    
    import java.util.*;
    public class newbie {
        public static void main(String args[]){
            int arr[]={1,2,3,4,5};
            toh(arr,0);
        }
        public static void toh(int arr[],int idx){
            if(idx==arr.length){
                return ;
            }
            
            System.out.println(arr[idx]);
            toh(arr,idx+1);
        }
    }
