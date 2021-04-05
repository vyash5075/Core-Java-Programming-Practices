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
          int dn=getproduct(b1,n1,n2);
          System.out.print(dn);
        }
        
        public static int getproduct(int b,int n1,int n2){
        
            int rv=0; int p=1;
            while(n2>0){
            int d2=n2%10;
            n2=n2/10;
           
            
            int sp=getproductwithsingledigit( b, n1, d2);
            
           sp=sp*p;
          
            rv=addition(b,rv,sp);
            p=p*10;
            }
            return rv;
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
        
        public static int getproductwithsingledigit(int b,int n1,int d2){
              int rv=0;
              int c=0;
              int p=1;
              while(n1>0||c>0){
                  int d1=n1%10;
                  n1=n1/10;
                  int d=d1*d2+c;
                  
                  c=d/b;
                  d=d%b;
                  rv+=d*p;
                  p=p*10;
              }
              return rv;
        }
         
        
         public static int product(int b1,int n1,int n2){
            int rv=0;
            int c=0;
            int p=1;
            while(n2>0){
                int d1=n1%10;
                int d2=n2%10;
                n1=n1/10;
                n2=n2/10;
                
                int d=0;
                d2=d2+c;
                
                if(d2>=d1){
                    c=0;
                    d=d2-d1;
                }
                else{
                    c=-1;
                    d=d2+b1-d1;
                }
                rv=rv+d*p;
                p=p*10;
               
                   }
         return rv;
       
        
          
        }    
       
    }
