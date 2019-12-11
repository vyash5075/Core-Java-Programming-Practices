import java.util.*;
public class removeduplicate {
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
        int tempp;
        for(int i=0;i<n;i++)
        {
            for(int k=i+1;k<n;k++)
            {
                if(arr[i]>arr[k])
                {
                    tempp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=tempp;
                }
            }
        }
        int temp[]=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j]=arr[i];
                j++;
                count++;
            }
        }
        temp[j]=arr[arr.length-1];
        System.out.println("array after removing duplicacy");
        for(int i=0;i<=count;i++)
        {
            System.out.println(temp[i]);
        }
    }
}