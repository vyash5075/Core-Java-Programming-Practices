    package strings;
    /*
    input 1,2,3,4,5,7,2,4,9
            4
    output 7
    
    
    */
    import java.util.*;
     class newbie {
        public static void main(String args[]){
            int arr[]={1,2,3,4,5,7,2,4,9};
          int data=  4;
          System.out.print(lastoccurence(arr,0,data));
          
        }
        public static int lastoccurence(int arr[],int idx,int x){
            if(idx==arr.length){
                return -1;
            }
             int lisa= lastoccurence(arr,idx+1,x);
            if(lisa==-1){
                if(arr[idx]==x){
                    return idx;
                }
                else{
                    return -1;
                }  
            }
            else{
                return lisa;
            }
            
           
          
        }
    }
