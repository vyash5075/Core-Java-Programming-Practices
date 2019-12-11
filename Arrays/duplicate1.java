import java.util.*;
public class duplicate1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size pof array");
        int n=sc.nextInt();
        System.out.println("enter elments");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
            int temp;
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
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
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
             System.out.println("System.out.println");
                
                for(int i=0;i<n;i++)
                {
                    for(int k=i+1;k<arr.length;k++)
                    {
                    if(arr[i]==arr[k])
                    {
                        System.out.println(arr[k]);
                     }
                }
                }
                
                    
        
    }
}
