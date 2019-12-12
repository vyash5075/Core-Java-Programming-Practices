import java.util.*;
public class array_to_arraylist {
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
        List<Integer>al=new ArrayList<>();
        {
           for(int m:arr)
           {
               al.add(m);
           }
             //Collections.addAll(al, geeks); 
            System.out.println("arraylist is");
            {
                System.out.println(al);
            }
        }
    }
}
