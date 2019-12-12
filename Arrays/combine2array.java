import java.util.*;
public class combine2array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         System.out.println("enter the size of second array");
          int m=sc.nextInt();
           int ar[]=new int[m];
             System.out.println("enter elements");
             for(int i=0;i<m;i++)
        {
            ar[i]=sc.nextInt();
        }
             int array[]=new int[n+m];
             int count=0;
             for(int i=0;i<n;i++)
             {
                 array[i]=arr[i];
                 count++;
             }
             for(int i=0;i<ar.length;i++)
             {
                 array[count++]=ar[i];
             }
             System.out.println("new array");
             for(int i=0;i<array.length;i++)
             {
                 System.out.println(array[i]);
             }
          
    }
}
