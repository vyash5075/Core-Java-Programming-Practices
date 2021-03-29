package strings;
import java.util.*;
public class printdecreasing{
 
   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       printdecreasing(n);
    }
   
   public static void printdecreasing(int n){
       if(n==0){
           return;//base condition
       }
     System.out.println(n);
     printdecreasing(n-1);
   }
         
}