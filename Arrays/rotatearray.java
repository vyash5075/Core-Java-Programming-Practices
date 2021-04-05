    package strings;
    //input  {1,2,3,4,5}
    //  2
    
    //output [4,5,1,2,3,]
    import java.util.*;
     class newbie {
        public static void main(String args[]){
       
          Scanner sc=new Scanner(System.in);
         int arr[]={1,2,3,4,5};
         int k=2;
         rotate(arr,k);
         
         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
        }
        public static int[]  reverse(int arr[],int i,int j){
           
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            return arr;
        } 
        public static int[] rotate(int arr[], int k){
            k=k%arr.length;
            if(k<0){
                k=k+arr.length;
            }
            
            
           reverse(arr,0,arr.length-k-1);
           reverse(arr,arr.length-k,arr.length-1);
           reverse(arr,0,arr.length-1);
           return arr;
     }   
