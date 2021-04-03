    package strings;
   //3
  //[111, 12, 21, 3] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int m=sc.nextInt();
           ArrayList<String>paths=getmazepathswithjumps(1,1,n,m);
           System.out.print(paths);
        }
      
        //sr=source row
        //sc=source column
        //dc=destination colun
        //dr=destination row
        public static ArrayList<String>getmazepathswithjumps(int sr,int sc,int dr,int dc){
           
            if(sr==dr&&sc==dc){
                ArrayList<String>bres=new ArrayList<>();
                bres.add("");
                return bres;
            }
            
            ArrayList<String> path=new ArrayList<String>();
            //horizontal rows
           for(int ms=1;ms<=dc-sc;ms++ )
           {  
               ArrayList<String>hpaths=getmazepathswithjumps(sr,sc+ms,dr,dc);
               for(String fhpath:hpaths){
                 
                   path.add("h"+ms+fhpath);
               }
           }
           //for vertical columns
           for(int ms=1;ms<=dr-sr;ms++){
               ArrayList<String>vpaths=getmazepathswithjumps(sr+ms,sc,dr,dc);
               for(String vhpath:vpaths){
                   path.add("v"+ms+vhpath);
               }
           }
           
           
           
           for(int ms=1;ms<=dr-sr&&ms<=dc-sc;ms++){
               ArrayList<String>dpaths=getmazepathswithjumps(sr+ms,sc+ms,dr,dc);
                for(String dhpath:dpaths){
                   path.add("d"+ms+dhpath);
               }
           }
           return path;
           }
    }
