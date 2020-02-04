/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class maxelememntmovetoend {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the no. of entries");
         int n=sc.nextInt();
          Queue<Integer>q=new LinkedList<>();
          for(int i=0;i<n;i++)
          {
              q.add(sc.nextInt());
          }
         int max=q.peek();
         for(int i=0;i<n;i++)
         {
                int temp=q.remove();
                if(max<temp)
                {
                    max=temp;
                }
                q.add(temp);
         }
         for(int i=0;i<n;i++)
         {
             int temp=q.remove();
             if(temp!=max)
             {
                 q.add(temp);
             }
         }
         q.add(max);
         System.out.println(q);
     }
}
