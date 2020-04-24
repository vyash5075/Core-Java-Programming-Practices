Jem is famous for his laziness at school. He always leaves things to last minute. Now Jem has N problems in the assignment of "Advanced topics in algorithm" class to solved. The assignment is due tomorrow and as you may guess he hasn't touch any of the problems. Fortunately he got a plan as always.
The first step will be buying a pack of Red Bull and then to work as hard as he can. Here is how he is going to spend the remaining time:
Jem will not take a break until he finishes at least half of the remaining problems. Formally, if N is even then he will take he first break after finishing N / 2 problems. If N is odd then the break will be after he done (N + 1) / 2 problems. Each of his break will last for B minutes. Initially, he takes M minutes in solving a problem, after each break he will take twice more time in solving a problem, i.e. 2 * M minutes per problem after the first break.
Jem will start working soon and ask you to help him calculate how much time it will take until he finish the last problem!
Input
The first line contains a single integer T represents the number of test cases in the input.
Each line in the next T line contains three integers N, B and M represents a test case.
Output
For each test case output a single line containing an integer represent how much time Jem will need (in minutes).
Constraints
·                     1 ≤ T ≤ 100
·                     1 ≤ N, B, M ≤ 108
Example
                    Input:
                    2
                    9 1 2
                    123456 123456 123456
 
                    Output:
                    45
                    131351258112

package amcat;
import java.util.*;

public class jem {
    	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0)
	    {
	        Long n=in.nextLong();
	        Long b=in.nextLong();
	        Long m=in.nextLong();
	        Long n1=n;
	        Long ans=0L;
	        //System.out.println(n1+" "+m+" "+b);
	        while(n>0)
	        {
	            if(n1%2==0)
	                {n1=n1/2;}
	                
	            else
	            {n1=(n1+1)/2;}
	            ans=ans+((n1*m)+b);
	            n=n-n1;
	            n1=n;
	            m=m*2;
	            //System.out.println(n+" "+n1+" "+m+" "+b+" "+ans);
	            
	        }
	       System.out.println(ans-b);
	        
	    }
	}
}
