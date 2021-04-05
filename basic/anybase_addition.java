    package strings;
 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
       
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the base of no.");
          int b1=sc.nextInt();
          System.out.println(" enter no.1 ");
          int n1=sc.nextInt();
           System.out.println(" enter no.2 ");
          int n2=sc.nextInt();
          int dn=addition(b1,n1,n2);
          System.out.print(dn);
        }
         
        
         public static int addition(int b1,int n1,int n2){
            int rv=0;
            int c=0;
            int p=1;
            while(n1>0||n2>0||c>0){
                int d1=n1%10;
                int d2=n2%10;
                n1=n1/10;
                n2=n2/10;
                int d=d1+d2+c;
                c=d/b1;
                d=d%b1;
                
                rv+=d*p;
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
       
        
          
