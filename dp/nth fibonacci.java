import java.util.*;
public class abc{
   public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    public static void main(String args[]){
        int n=6;
        
        System.out.println(dpfibonacci(n));
    }
    
    public static int dpfibonacci(int n){
        
        if(hm.containsKey(n))return hm.get(n);
        
        
      if(n==0)return 0;
      if(n==1)return 1;
       int nthValue = dpfibonacci(n - 1) + dpfibonacci(n - 2);
        hm.put(n,nthValue);
        return nthValue;
       
    }
}
