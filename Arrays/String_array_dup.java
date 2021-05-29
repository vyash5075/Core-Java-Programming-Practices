import java.util.*;
public class String_array_dup {
    public static void main(String aargs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("enter strings");
        for(int i=0;i<n ;i++)
        {
            arr[i]=sc.next();
        }
       
        System.out.println("duplicate elements are");
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j])&&i!=j)
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
