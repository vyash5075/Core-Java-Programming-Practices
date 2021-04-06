    package strings;
    /*
    input=[4,1,0,2,3]
    output =[2,1,3,4,0]
        
    */
    import java.util.*;
     class newbie {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
          int arr[]={4,1,0,2,3};
          int max=arr[0];
         inverse(arr);
         
    }
        
        public static void inverse(int arr[]){
            int inv[]=new int [arr.length];
            for(int i=0;i<arr.length;i++){
                int v=arr[i];
                inv[v]=i;
            }
            
            for(int i=0;i<inv.length;i++){
                System.out.println(inv[i]);
            }
        }
          
     }
