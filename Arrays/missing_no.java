import java.util.*;
public class missing_no {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int exp_output=arr.length+1;
        int total_sum=(exp_output*(exp_output+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int diff=total_sum-sum;
        System.out.println("missing element is"+diff);  
    }
}
