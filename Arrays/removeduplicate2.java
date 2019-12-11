import java.util.*;
public class removeduplicate2 {
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
        System.out.println("array after removing duplicacy");
        HashSet<Integer> h=new HashSet<>();
        for(int m:arr)
            
        {
            boolean b=h.add(m);
            if(b==true)
            {
                System.out.println(m);
            }
        }
        System.out.println("length of array is"+h.size());
    }
}
