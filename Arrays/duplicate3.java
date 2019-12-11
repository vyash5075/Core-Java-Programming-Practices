import java.util.*;
public class duplicate3 {
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
        Map<Integer,Integer> s=new HashMap<>();
        for(int m:arr)
        {
            Integer count=s.get(m);
            if(count==null)
            {
                s.put(m,1);
            }
            else
            {
                count=count+1;
                s.put(m, count);
            }
        }
        System.out.println("duplicate elements are");
        Set<Map.Entry<Integer,Integer>>es= s.entrySet();
        for(Map.Entry<Integer,Integer>p:es)
        {
         if(p.getValue()>1)
         {
             System.out.println(p.getKey());
         }
        }
    }
}
