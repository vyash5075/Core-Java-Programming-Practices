import java.util.*;
public class insert_arraylist {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new  int[n];
        for(int i =0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
        ArrayList a=new ArrayList<>();
        for(int m:arr)
        {
            a.add(m);
        }
        System.out.println("enter the element u want to insert");
        int p=sc.nextInt();
        a.add(p);
        System.out.println("new array is");
        System.out.println(a);
        System.out.println("enetr the position where u want insert one more element ");
        int pos=sc.nextInt();
        System.out.println("eneter another element");
        int l=sc.nextInt();
        a.add(pos,l);
        System.out.println("current array is"+a);
        
    }
}
