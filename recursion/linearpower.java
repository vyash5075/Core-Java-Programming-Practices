    package strings;
    import java.util.*;
    public class power {

       public static void main(String[] args)
        {
           Scanner sc=new Scanner(System.in);
           int x=sc.nextInt();
           int n=sc.nextInt();
           //factorial(n);
           System.out.println(power(x,n));
        }

       public static int power(int x,int n){
           if(n==0){
               return 1;//base condition
           }
           
           int fn=power(x,n-1);
           int res=x*fn;
           return res;
       }
------------------------------------------------------------------------------
    //way2 in O(log n)
        package strings;
    import java.util.*;
    public class newbie {

       public static void main(String[] args)
        {
           Scanner sc=new Scanner(System.in);
           int x=sc.nextInt();
           int n=sc.nextInt();
           //factorial(n);
           System.out.println(power(x,n));
        }

       public static int power(int x,int n){
           if(n==0){
               return 1;//base condition
           }
           
           int fn=power(x,n/2);
           int res=fn*fn;
           
           if(n%2==1){
               res=res*x;
           }
           return res;
       }

    }
