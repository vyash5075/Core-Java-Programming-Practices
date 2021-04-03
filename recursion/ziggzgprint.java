    package strings;
    /*
    input 1
    output 111
    
    input 2
    output 211121112
    
    input 3
    output 321112111232111211123
    */
    import java.util.*;
    public class newbie {

       public static void main(String[] args)
        {
           Scanner sc=new Scanner(System.in);
       
           int n=sc.nextInt();
        
          pzz(n);
        }

       public static void pzz(int n){
           if(n==0){
               return ;//base condition
           }
           
          System.out.print( n+ "pre ");
           pzz(n-1);
           System.out.print(n+"In ");
           pzz(n-1);
           System.out.print(n+" post");
               }

    }
