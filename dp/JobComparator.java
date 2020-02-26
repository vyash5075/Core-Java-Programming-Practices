/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;
import java.util.*;
import java.util.Comparator; 
/**
 *
 * @author yash verma
 */
class Job{
      int start,finish,profit;
      Job(int start, int finish, int profit) 
	{ 
		this.start = start; 
		this.finish = finish; 
		this.profit = profit; 
	} 
} 
class JobComparator implements Comparator<Job> 
    {
     public int compare(Job a, Job b) 
	{ 
		return a.finish < b.finish ? -1 : a.finish == b.finish ? 0 : 1; 
	} 
    }
public class weightedjobscheduling {
    int start,finish,profit;
    weightedjobscheduling(int start,int finish,int profit)
    {
        this.start=start;
        this.finish=finish;
        this.profit=profit;
    }
static public int binarysearch(Job jobs[], int index) 
	{ 
		
		int lo = 0, hi = index - 1; 
		while (lo <= hi) 
		{ 
			int mid = (lo + hi) / 2; 
			if (jobs[mid].finish <= jobs[index].start) 
			{ 
				if (jobs[mid + 1].finish <= jobs[index].start) 
					lo = mid + 1; 
				else
					return mid; 
			} 
			else
				hi = mid - 1; 
		} 

		return -1; 
	} 
    public static int schedule(Job arr[])
    {
      Arrays.sort(arr, new JobComparator()); 
      int n=arr.length;
      int table[]=new int [n];
      for(int i=1;i<n;i++)
      {
          int prof=arr[i].profit;
          int l=binarysearch(arr,i);
          if(l!=-1)
          {
              prof+=table[l];
              table[i]=Math.max(prof,table[i-1]);
          }
          
          
      }return table[n-1];
    }
    
    
    public static void main(String args[])
    {
       Job jobs[] = {new Job(1, 2, 50), new Job(3, 5, 20), 
					new Job(6, 19, 100), new Job(2, 100, 200)}; 

		System.out.println("Optimal profit is " + schedule(jobs)); 
    }
    
}
