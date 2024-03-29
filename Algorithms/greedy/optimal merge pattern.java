//output: 68

import java.util.*;
public class gfg{
    
     static int minComputation(int size, int files[])
    {
           PriorityQueue<Integer>pq = new PriorityQueue<>();
  
        for (int i = 0; i < size; i++) {
            pq.add(files[i]);
        }
        int count = 0;
  
        while (pq.size() > 1) {
            int temp = pq.poll() + pq.poll();
            count += temp;
            pq.add(temp);
        }
  
        return count; 
     }
    public static void main(String args[]){
        
        int size = 6;
  
         
        int files[] = new int[] { 2, 3, 4, 5, 6, 7 };
    
        System.out.println("Minimum Computations = "
                           + minComputation(size, files));
    }
}
