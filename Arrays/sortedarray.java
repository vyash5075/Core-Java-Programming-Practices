import java.util.*;
public class sortedarray {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++)
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
     System.out.println("sorted array");
     for(int i=0;i<arr.length;i++)
     {
         System.out.println(arr[i]);
     }
}
}
