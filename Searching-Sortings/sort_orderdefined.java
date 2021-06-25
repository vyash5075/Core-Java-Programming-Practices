/*Given two integer arrays A1[ ] and A2[ ] of size N and M respectively. Sort the first array A1[ ] such that all the relative positions of the elements in the first array are the same as the elements in the second array A2[ ].
See example for better understanding.
Note: If elements are repeated in the second array, consider their first occurance only.
Input:
N = 11 
M = 4
A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
A2[] = {2, 1, 8, 3}
Output: 
2 2 1 1 8 8 3 5 6 7 9
Explanation: Array elements of A1[] are
sorted according to A2[]. So 2 comes first
then 1 comes, then comes 8, then finally 3
comes, now we append remaining elements in
sorted order.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


 // } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int n, int A2[], int m)
    {
        //Your code here
        Arrays.sort(A1);
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        map.put(A1[i],map.getOrDefault(A1[i],0)+1);
        //System.out.println(map);
        
        int ans[]=new int[n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            if(map.containsKey(A2[i]))
            {
            int freq=map.get(A2[i]);
                while(freq!=0)
                {
                    ans[k++]=A2[i];
                    freq--;
                }
            
            map.remove(A2[i]);
            }
        }
       // System.out.println(map);
      for(Map.Entry<Integer,Integer> item:map.entrySet())
      {
          int key=item.getKey();
          for(int i=0;i<item.getValue();i++)
          {
              ans[k++]=key;
          }
      }
      
        return ans;
        
        
    }
}



// { Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}


  // } Driver Code Ends
