import java.util.*;
public class sep_even_odd_arraylist {
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
        ArrayList<Integer>even=new ArrayList<>();
         ArrayList<Integer>odd=new ArrayList<>();
        for(int b:arr)
        {
         if(b%2==0)
         {
             even.add(b);
         }
         else
         {
             odd.add(b);
             
         }
        }
         System.out.println("even elements are");
         System.out.println(even);
         System.out.println("odd eleents are");
         System.out.println(odd);
        
    
}
}