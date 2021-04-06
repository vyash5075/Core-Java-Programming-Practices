    package strings;
    /*output 
    //      *   
            *   
            * * 
            * * 
      *     * * 
      *     * * 
      * *   * * 
    */
    import java.util.*;
     class newbie {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
          int arr[]={3,1,0,7,5};
          int max=arr[0];
          for(int i=0;i<arr.length;i++){
              if(arr[i]>max){
                  max=arr[i];
              }
              
          }
          for(int floor=max;floor>=1;floor--){
              for(int i=0;i<arr.length;i++){
                  if(arr[i]>=floor){
                      System.out.print("*"+" ");
                  }
                  else{
                     System.out.print("  "); 
                  }
              }
              System.out.println();
          }
    }
          
     }
