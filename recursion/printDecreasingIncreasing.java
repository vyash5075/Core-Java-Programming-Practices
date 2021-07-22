/*
Input: 5
Output: 5 4 3 2 1 1 2 3 4 5
*/



package strings;
import java.util.*;
public class printDecreasingIncreasing {
 
   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       printIncreasing(n);
    }
   
   public static void printDecreasingIncreasing(int n){
       if(n==0){
           return;//base condition
       }
       System.out.println(n);
     printIncreasing(n-1);
     System.out.println(n);
   }
         
}
