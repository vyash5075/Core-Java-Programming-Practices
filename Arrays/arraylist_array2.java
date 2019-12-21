import java.util.*;
public class arraylist_array2 {
    public static void main(String args[])
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(4);
        al.add(6);
        al.add(78);
        al.add(45);
        al.add(34);
        System.out.println(al);
        Integer arr[]=new Integer[al.size()];
        arr=al.toArray(arr);
        for(Integer g:arr)
        {
            System.out.println(g);
        }
}
}
