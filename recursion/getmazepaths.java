    package strings;
   //3
  //[111, 12, 21, 3] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int m=sc.nextInt();
           ArrayList<String>paths=getmazepaths(1,1,n,m);
           System.out.print(paths);
        }
        //make global array
        static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
                
        //678
        public static ArrayList<String>getmazepaths(int sr,int sc,int dr,int dc){
              
            if(sr==dr && sc==dc){
                ArrayList<String>bres=new ArrayList<>();
                bres.add("");
                return bres;
            }
            
            ArrayList<String>hpaths=new ArrayList<>();
            ArrayList<String>vpaths=new ArrayList<>();
            if(sc<dc){
                hpaths=getmazepaths(sr,sc+1,dr,dc);
            }
            if(sr<dr){
                vpaths=getmazepaths(sr+1,sc,dr,dc);
            }
            ArrayList<String>paths=  new ArrayList<>();
               
               for(String hpath:hpaths){        
                  
                   paths.add("h"+hpath);
               }
               for(String vpath:vpaths){
                   paths.add("v"+vpath);
               }
               return paths;  
        }
    }
