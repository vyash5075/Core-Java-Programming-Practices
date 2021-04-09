    package strings;
    import java.util.*;
     class newbie {
         public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int n=2;
           sieveOfEratosthenesprime(n);
         }
         public static void sieveOfEratosthenesprime(int n){
             boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++)
        {
           
            if (prime[p] == true)
            {
                
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
        int count=0;
        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == true)
               count++;
        }
        System.out.println(count);
         }
     }
