import java.util.*;
public class rem_first-dup {
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
        System.out.println("first duplicate element is");
        for(int i=0;i<n;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }
}
}