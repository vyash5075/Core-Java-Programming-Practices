import java.util.*;
public class primefactorization{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=2;
   for(int i=2;i<n;i++){
    while(n%i==0){
        n=n/i;
        System.out.println(i);
    }
}
}

------------------------------------------------------------
//way2(optimised)
  public class primefactorization{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=2;
   for(int i=2;i*i<n;i++){
    while(n%i==0){
        n=n/i;
        System.out.println(i);
    }
   
     if(n!=1)
     {
       System.out.println(n);
     }
   }
}
