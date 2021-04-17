    package strings;
   //3
  //[111, 12, 21, 3] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
           ArrayList<String>paths=getStairpaths(n);
           System.out.print(paths);
        }
        //make global array
      
        public static ArrayList<String>getStairpaths(int n){
                
            if(n==0){
                ArrayList<String>bres=new ArrayList<>();
                bres.add("");
                return bres;    
            }
            else if(n<0){
                 ArrayList<String>bres=new ArrayList<>();
                return bres;
            }
            
               ArrayList<String>path1=  getStairpaths(n-1);
               ArrayList<String>path2=  getStairpaths(n-2);
               ArrayList<String>path3=  getStairpaths(n-3);
               ArrayList<String>paths=  new ArrayList<>();
               
               for(String path:path1){
                   paths.add(1+path);
               }
               for(String path:path2){
                   paths.add(2+path);
               }for(String path:path3){
                   paths.add(3+path);
               }
               return paths;
        
               
          
        }
    }
