    package strings;
    /*
    input=[4,1,0,2,3]
    output =[2,1,3,4,0]
        
    */
    import java.util.*;
     class newbie {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
          int arr[]={1,2,4,5,6};
          int max=arr[0];
          int data=3;
        
          int lo=0;
          int ceil=0;
          int floor=0;
          int hi=arr.length-1;
         while(lo<=hi){
             int mid=(lo+hi)/2;
             if(data<arr[mid]){
                hi=arr[mid-1];
                ceil=arr[mid];
             }
             else if(data>arr[mid]){
                
                 lo=arr[mid+1];
        
                 floor=arr[mid];
                 break;
             }
             
         }
         System.out.println("ceil"+ceil);
         System.out.println("floor"+floor);
    }
        
       
          
     }
