import java.util.*;
public class non_repeating_ele {
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
        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            res=res^arr[i];                 //XOR operation
        }
        System.out.println("single   element is" + res);
}
} 