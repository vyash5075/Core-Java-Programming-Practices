//https://www.geeksforgeeks.org/minimum-fibonacci-terms-sum-equal-k/
import java.util.*;
public class abc{
    public static void main(String args[]){
        int k=17;
        System.out.println(fibmin(k));
    }
    
    public static int fibmin(int k){
        ArrayList<Integer>fibterms=new ArrayList<Integer>();
        calcFiboTerms(fibterms,k);
        
        int count=0;
        int j=fibterms.size()-1;
        while(k>0){
              count += (k / fibterms.get(j));
            k %= (fibterms.get(j));
           //System.out.println(fibterms.get(j));
            j--;
        }
        return count;
    }
    
    public static void calcFiboTerms(ArrayList<Integer>fibterms,int k){
        int i=3,nextterm=0;
     fibterms.add(0);
     fibterms.add(1);
     fibterms.add(1);
     
     while(true){
         nextterm=fibterms.get(i - 1) + fibterms.get(i - 2);
         if(nextterm>k)return;
         fibterms.add(nextterm);
         i++;
     }
    }
    
}
