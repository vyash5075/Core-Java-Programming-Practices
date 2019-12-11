import java.util.*;
public class even_odd_sep {
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
        int j=0;
        int k=0;
        int count1=0;
        int count2=0;
        int even[]=new int[n];
        int odd[]=new int [n];
        int c=-1;
        int d=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even[j]=arr[i];
                count1++;
                j++;
                c++;
            }
            else
            {
                odd[k]=arr[i];
                count2++;
                k++;
                d++;
            }
        }
       
        System.out.println("total even elements are "+count1);
         System.out.println("even elements are"); 
        for(int i=0;i<=c;i++)
        {
            System.out.println(even[i]);
        }
        
        System.out.println("total odd elements are "+count2);
         System.out.println("odd elements are");
        for(int i=0;i<=d;i++)
        {
            System.out.println(odd[i]);
        }
    }
}
