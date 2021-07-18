//minimum squares of mamx to max size
//https://www.geeksforgeeks.org/paper-cut-minimum-number-squares/
import java.util.*;
public class gfg{
        public static void main(String args[]){
           int m=29;
           int n=13;
           
           System.out.println(minsquares(m,n));
        }
        
        public static int minsquares(int m,int n){
            if(m<n){
                  int temp = m;
    m = n;
    n = temp;
            }
            
            int result=0;
            while(n>0){
                result+=m/n;
                int rem=m%n;
                  m=n;
                n=rem;
            }
            
            return result;
        }
    }
