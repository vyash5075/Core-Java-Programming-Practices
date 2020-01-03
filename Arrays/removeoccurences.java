import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author yash verma
 */
public class removeoccurences {
    public static int[] delete(int arr[],int item)
    {
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=item)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        return Arrays.copyOf(arr, index);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element u want to delete");
        int item=sc.nextInt();
        arr=delete(arr,item);
        System.out.println("new array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
