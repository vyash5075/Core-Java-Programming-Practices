import java.util.*;
public class arraylist_array{
    public static void main(String args[])
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(4);
        al.add(6);
        al.add(78);
        al.add(45);
        al.add(34);
        System.out.println(al);
        int m=al.size();
        System.out.println("size of arraylist is"+al.size());
        int arr[]=new int [m];
        for(int i=0;i<m;i++)
        {
            arr[i]=al.get(i);
        }
       System.out.println("array is");
       for(int i=0;i<m;i++)
       {
           System.out.println(arr[i]);
       }
    }
}
