    package strings;
   //3
  //[111, 12, 21, 3] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int m=sc.nextInt();
           printmazePathswithjumps(1,1,n,m,"");
        }
        
        
        public static void  printmazePathswithjumps(int sr,int sc, int dr,int dc,String psf){
        
            if(sr>dr||sc>dc){
                return;
            }
            if(sr==dr&sc==dc){
                System.out.println(psf);
                return;
            }
            
            
            for(int ms=1;ms<=dc-sc;ms++){
               printmazePathswithjumps(sr,sc+ms,dr,dc,psf+"h"+ms);
            }
             for(int ms=1;ms<=dr-sr;ms++){
               printmazePathswithjumps(sr+ms,sc,dr,dc,psf+"v"+ms);
            }
            for(int ms=1;ms<=dc-sc;ms++){
               printmazePathswithjumps(sr,sc+ms,dr,dc,psf+"h"+ms);
            }
            
             for(int ms=1;ms<=dc-sc&&ms<=dr-sr;ms++){
               printmazePathswithjumps(sr+ms,sc+ms,dr,dc,psf+"d"+ms);
            }
        }
      
        
