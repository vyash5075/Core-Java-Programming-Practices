    package strings;
 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
       
          Scanner sc=new Scanner(System.in);
          System.out.println(" enter no. in decimal base");
          int n=sc.nextInt();
          System.out.println("enter the conversion base");
          int m=sc.nextInt();
          int dn=getvalueinbase(n,m);
          System.out.print(dn);
        }
        public static int getvalueinbase(int n,int m){
            int rv=0;
            int p=1;
            while(n>0){
                int dig=n%m;
                
                n=n/m;
                rv+=dig*p;
                p=p*10;
           
        }
         return rv;
       
        
          
        }   
    }
