import java.util.*;
public class pairsum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no.");
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]+arr[j]==m)
                {
                    System.out.println("pair is "+arr[i]+","+arr[j]);
                }
            }
        }
    }
}
