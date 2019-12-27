import java.util.*;

public class frequency {
    public static void main(String args[])
    {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int dup[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            dup[i]=-1;
        }
        int count;
        for(int i=0;i<n;i++)
        {count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    dup[j]=0;
                }
            }
            if(dup[i]!=0)
            {
                dup[i]=count;
            }
        }
        System.out.println("duplicate eleleemnts are");
        for(int i=0;i<n;i++)
        {
            System.out.println("number"+arr[i]+"count"+dup[i]);
        }
        }
}
     