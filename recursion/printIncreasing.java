/*
input: 5
output: 1 2 3 4 5
*/
package strings;
import java.util.*;
public class printIncreasing {
 
   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       printIncreasing(n);
    }
   
   public static void printIncreasing(int n){
       if(n==0){
           return;//base condition
       }
     printIncreasing(n-1);
     System.out.println(n);
   }
         
}
