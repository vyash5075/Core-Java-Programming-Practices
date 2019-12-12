import java.util.*;
public class max_subarray_sum {
    public static void main(String args[])
    {
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        int start;
        int end;
        int max_so_far=Integer.MIN_VALUE;
        int max_ending=0;
        for(int i=0;i<arr.length;i++)
        {
            max_ending=max_ending+arr[i];
            if(max_so_far<max_ending)
            {
                max_so_far=max_ending;
                start=s;
                end=i;
            }
            if(max_ending<0)
            {
                max_ending=0;
                s=i+1;
            }
        }
        System.out.println("sum of max sub array is "+max_so_far);
    }       
}
