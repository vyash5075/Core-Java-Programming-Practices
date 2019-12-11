import java.util.*;
public class nth_min {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i= 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
       
         for(int i=0;i<n-1;i++)
     {
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[i]>arr[j])
             {
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }
     }
        System.out.println("enter the nth min element");
        int min=sc.nextInt();
        System.out.println(min+"th min element is"+arr[min-1]);
    }
}
