import java.util.*;
public class nth_max_element {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array");
       int n=sc.nextInt();
       int arr[]=new int [n];
       System.out.println("enter the elements");
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       int temp;
       // now sort the array
       for(int i=0;i<arr.length;i++)
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
       System.out.println("enter the nth largest no.");
       int p=sc.nextInt();
       System.out.println("the "+p+"th largest no. is"+arr[n-p]);
               
    }
}
