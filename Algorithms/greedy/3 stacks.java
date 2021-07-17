/*
Input : stack1[] = { 3, 10}
  stack2[] = { 4, 5 }
  stack3[] = { 2, 1 }
Output : 0

//https://www.geeksforgeeks.org/find-maximum-sum-possible-equal-sum-three-stacks/
*/

import java.util.*;
public class abc{
    public static void main(String[] args)
    {
          int stack1[] = { 3, 2, 1, 1, 1 };
          int stack2[] = { 4, 3, 2 };
          int stack3[] = { 1, 1, 4, 1 };
          
          int n1 = stack1.length;
          int n2 = stack2.length;
          int n3 = stack3.length;
          
          System.out.println(maxSum(stack1, stack2,
                               stack3, n1, n2, n3));
    }
    
      public static int maxSum(int stack1[], int stack2[],
                            int stack3[], int n1, int n2,
                                               int n3)
    {
        
        int top1=0;
        int top2=0;
        int top3=0;
        int sum1=0,sum2=0,sum3=0;
        for (int i=0; i < n1; i++)
          sum1 += stack1[i];
       for (int i=0; i < n2; i++)
          sum2 += stack2[i];
       for (int i=0; i < n3; i++)
          sum3 += stack3[i];
     int ans=0;
     while(true){
         if(top1==n1||top2==n2||top3==n3){
             return 0;
             
         }
         if(sum1==sum2&&sum2==sum3)return sum1;
         
         if(sum1>=sum2&&sum1>=sum3){
             sum1-=stack1[top1++];
         }
         else if(sum2>=sum1&&sum2>=sum3){
             sum2-=stack2[top2++];
         }
         else if(sum3>=sum1&&sum3>=sum2){
             sum3-=stack3[top3++];
         }
     }
    }
}
