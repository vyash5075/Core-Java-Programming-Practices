import java.util.*;
public class subarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("yy");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
          
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {  
            for(int j=i;j<n;j++)
            {count=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    count++;
                }
                if(count>=2)
                    {
                        sum=sum+1;
                    }
                
                
                System.out.println("");
            }
            System.out.println(" ");
           
        }
        System.out.println("ghj"+sum);
    }
}
