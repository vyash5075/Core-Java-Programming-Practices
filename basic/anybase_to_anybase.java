    package strings;
 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
       
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the base of no.");
          int b1=sc.nextInt();
          System.out.println(" enter no. ");
          int n=sc.nextInt();
          System.out.println("enter the conversion base");
          int b2=sc.nextInt();
          int dn=getvalueinbase(n,b2,b1);
          System.out.print(dn);
        }
        public static int getvalueinbase(int n,int b2,int b1){
              int dn=getvaluetodecimal(n,b1);
              int dnn=decimaltoanybase(dn,b2);
         return dnn;
       
        
          
        }   
        
         public static int decimaltoanybase(int n,int b2){
            int rv=0;
            int p=1;
            while(n>0){
                int dig=n%b2;
                
                n=n/b2;
                rv+=dig*p;
                p=p*10;
           
        }
         return rv;
       
        
          
        }    
         public static int getvaluetodecimal(int n,int b1){
            int rv=0;
            int p=1;
            while(n>0){
                int dig=n%10;
                
                n=n/10;
                rv+=dig*p;
                p=p*b1;
           
        }
         return rv;
       
        
          
        }   
    }
