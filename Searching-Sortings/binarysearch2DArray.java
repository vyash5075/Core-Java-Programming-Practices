    package strings;
    import java.util.*;
    
    /*
    input=> 
    [[1,2,3,4],[11,12,13,14],[21,22,23,24],[31,32,33,34]]
    31
    output=>3,1
   [[1,5],[6,9]]
    */
     class newbie {
         static String max;
         public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int arr[][]={{1,2,3,4},{11,12,13,14},{21,22,23,24},{31,32,33,34}};
           int n=31;
           search(arr,n);
        
     }
         public static void search(int arr[][],int x){
             int i=0;
             int j=arr.length-1;
             while(i<arr.length&&j>=0){
                 if(x==arr[i][j]){
                     System.out.println(i+","+j);
                     return;
                 }
                 else if(x<arr[i][j]){
                  j--;   
                 }
                 else{
                     i++;
                 }
             }
             System.out.println("not found");
         }
          
      
     }
         
     
