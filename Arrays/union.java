import java.util.*;
public class union {
    public static void union(int arr[],int arr2[])
    {
       HashSet<Integer>hs=new HashSet<Integer>();
       for(int i=0;i<arr.length;i++)
       {
           hs.add(arr[i]);
       }
       for(int i=0;i<arr2.length;i++)
       {
           hs.add(arr2[i]);
       }
       System.out.println("s"+hs);
        
            
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of one array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the size of one array");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
         union(arr,arr2); 
    }
}
