import java.util.*;
public class duplicate2 {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of array");
     int n =sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
         
     }
     System.out.println("duplicate elements are");
     Set<Integer> s=new HashSet<>();
     for(int m:arr)
     {
         boolean b=s.add(m);
         if(b==false)
         {
             System.out.println(m);
         }
     }
    }
    
}
