
package searchingsorting;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class bubblesort {
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
            System.out.println(" kk"+a[c]);
            }       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        System.out.println("enter the elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        bsort(a);
        
        
    }
}
