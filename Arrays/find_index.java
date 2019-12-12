import java.util.*;
public class find_index {
   public static void main(String args[])
    {
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to search");
        int item=sc.nextInt();
        int flag=0;
        int m=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
                flag=1;
                m=i;
                break;
            }
            
        }
        if(flag ==1)
        {
            System.out.println("element is successfully find at "+ m+" index");
        }  
}
}