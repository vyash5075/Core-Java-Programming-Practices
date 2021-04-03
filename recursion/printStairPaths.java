    package strings;
   //3
  //[111, 12, 21, 3] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           printStairPaths(n,"");
        }
        
        
        public static void  printStairPaths(int n,String path){
            
          if(n<0){
              return;
          }
          if(n==0){
              System.out.println(path);
              return;
          }
           printStairPaths(n-1,path+"1");
           printStairPaths(n-2,path+"2");
           printStairPaths(n-3,path+"3");
            
        }
      
        
    }
