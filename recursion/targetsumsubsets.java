    package strings;
   //3
  //[111, 12, 21, 3] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
              
                  arr[i]=sc.nextInt();
             
              
        }
          System.out.println("target value");
       int target=sc.nextInt();
         
          printtargetsubsets(arr,0,"",0,target);
        
        }
        
        public static void printtargetsubsets(int arr[],int idx,String set,int sos,int tar){
           
          if(idx==arr.length){
              if(sos==tar){
                  System.out.println(set+".");
                  return;
              }
              else{
                  return;
              }
          }
            printtargetsubsets(arr,idx+1,set+arr[idx]+",",sos+arr[idx],tar);
             printtargetsubsets(arr,idx+1,set+",",sos,tar);
        }
        
    }
