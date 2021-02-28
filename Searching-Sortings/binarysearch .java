
package searchingsorting;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class binarysearch {
     public  static void bsort(int a[])
    {
            int  n= a.length;
            for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                 int temp;
             temp=a[j];
             a[j]=a[j+1];
             a[j+1]=temp;
               
            }
        }
       
    }
             for(int c=0;c<n;c++)
            {
            System.out.println(a[c]);
            }
    }
    public static int bsearch(int ar[],int n,int item)
    {
        int start=0;
        int end=n-1;
        int mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(ar[mid]<item)
            {
                start=mid+1;
            }
            else if(ar[mid]>item)
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enetr the size of array");
        int n=sc.nextInt();
        System.out.println("enter the elements of array");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
         bsort(ar);
        System.out.println("enter the item to search");
        int item=sc.nextInt();
        int pos=bsearch(ar,n,item);
                if (pos==-1)
                {
                    System.out.println("element not found");
                }
                else{
                    System.out.println("element is fount at position "+pos);
                }       
    }
}
