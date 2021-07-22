/*
input n=5
output=120
*/
import java.util.*;
public class abc{
    public static void main(String args[]){
        int n=5;
    System.out.println(fact(1));
    }
    
    public static int fact(int n){
        
        if(n==1){
            
            return 1;
        }
        
        
  return n*fact(n-1);
       
    }
}
