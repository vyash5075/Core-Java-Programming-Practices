//https://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/

import java.util.*;
public class gfg{
public static void main(String args[]){
    int arr[]={5,9,4,1};
   System.out.println(count(arr));
}
  
    public static int count(int arr[]){
       Queue<Integer>p=new PriorityQueue<>((n1, n2) -> n1 - n2);
        for(int k:arr){
            p.add(k);
        }
        int cost=0;
        while(p.size()>1){
            int k=p.peek();
            p.remove();
            int k2=p.peek();
            p.remove();
            int sum=k+k2;
            cost+=sum;
            p.add(sum);
        }
       // System.out.println(cost);
        return cost;
    } 
    
}
