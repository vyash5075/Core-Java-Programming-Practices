import java.util.*;
public class delete {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the item u want to delete");
        int item=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==item)
            {
                for(int j=i;j<arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
               count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element deleted successfully");
        }
        System.out.println("new array is");
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}