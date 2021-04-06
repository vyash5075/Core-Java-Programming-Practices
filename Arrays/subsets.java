    package strings;
    /*
    input=[1,2,3]
    output 0=
-	-	-	
-	-	3	
-	2	-	
-	2	3	
1	-	-	
1	-	3	
1	2	-	
1	2	3
        
    */
    import java.util.*;
     class newbie {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
          int arr[]={1,2,3};
         subsets(arr);
    }
        
        public static void subsets(int arr[]){
            int limit=(int)Math.pow(2,arr.length);
            for(int i=0;i<limit;i++){
                String set="";
                int temp=i;
            //convert i to binary and use 0's and 1's
                for(int j=arr.length-1;j>=0;j--){
                    int r=temp%2;
                    temp=temp/2;
                    
                    if(r==0){
                        set="-\t"+set;
                    }
                        else{
                        set=arr[j]+"\t"+set;
                                
                                }
                    }
                System.out.println(set);
                }
        }
        }
        
       
    
