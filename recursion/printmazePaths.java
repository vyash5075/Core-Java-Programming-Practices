    package strings;
   //3
  //[111, 12, 21, 3] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int m=sc.nextInt();
           printmazePaths(1,1,n,m,"");
        }
        
        
        public static void  printmazePaths(int sr,int sc, int dr,int dc,String psf){
        
            if(sr>dr||sc>dc){
                return;
            }
            if(sr==dr&sc==dc){
                System.out.println(psf);
                return;
            }
            printmazePaths(sr,sc+1,dr,dc,psf+"h");
               printmazePaths(sr,sc+1,dr,dc,psf+"h");
        }
      
        
    }
