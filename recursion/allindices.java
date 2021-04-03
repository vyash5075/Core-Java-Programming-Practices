    package strings;
    // input 5, [1,2,1,2,3]
    //        1
    //output= [0,2]          
              
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];
           
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           int x=sc.nextInt();
          int k[]=  allindices(arr,x,0,0);
           for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
           }
        }
        public static int[] allindices(int arr[],int x,int idx,int fsf ){
            
            if(idx==arr.length){
                return new int[fsf];
            }
            if(arr[idx]==x){
              int iarr[]=  allindices(arr,x,idx+1,fsf+1);
              iarr[fsf]=idx;
              return iarr;
            }
            else{
                int iarr[]=  allindices(arr,x,idx+1,fsf);
                return iarr;
            }
