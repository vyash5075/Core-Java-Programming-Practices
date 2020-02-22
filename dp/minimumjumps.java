import java.util.*;
/**
 n=6
    1
    3
    6
    1
    0
    9
    minimum jumps to reach end are3
 *
 * @author yash verma
 */
public class minimumjumps {
    public static int minjumps(int arr[],int n)
    {
    int jumps[]=new int[n];
    if(n==0||arr[0]==0)
    {
        return Integer.MAX_VALUE;
        
    }
    jumps[0]=0;
    for (int i = 1; i < n; i++) { 
            jumps[i] = Integer.MAX_VALUE; 
            for (int j = 0; j <i; j++) { 
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) { 
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1); 
                    break; 
                } 
            } 
        } 
    return jumps[n-1];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       System.out.println( "minimum jumps to reach end are"+minjumps(arr,n));
    }
}
